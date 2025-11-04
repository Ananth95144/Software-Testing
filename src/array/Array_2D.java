package array;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] array = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Original 2D Array:");
        printArray(array);
       
        // Searching an element
        System.out.print("\nEnter element to search: ");
        int searchElement = scan.nextInt();
        int[] searchIndex = search(array, searchElement);
        if (searchIndex[0] != -1) {
            System.out.println("Element found at position: (" + searchIndex[0] + ", " + searchIndex[1] + ")");
        } else {
            System.out.println("Element not found.");
        }

        // Deleting an element
        System.out.print("\nEnter element to delete: ");
        int deleteElement = scan.nextInt();
        array = delete(array, deleteElement);

        System.out.println("2D Array after deletion:");
        printArray(array);

        // Inserting an element
        System.out.print("\nEnter row to insert into: ");
        int row = scan.nextInt();
        System.out.print("Enter position in the row: ");
        int col = scan.nextInt();
        System.out.print("Enter value to insert: ");
        int value = scan.nextInt();
        array = insert(array, row, col, value);

        System.out.println("2D Array after insertion:");
        printArray(array);

        // Adding a new row
        System.out.print("\nEnter position to add a new row: ");
        int newRowPos = scan.nextInt();
        System.out.print("Enter the number of elements in the new row: ");
        int newRowSize = scan.nextInt();
        int[] newRow = new int[newRowSize];
        for (int i = 0; i < newRowSize; i++) {
            System.out.print("Enter value for new row element " + (i + 1) + ": ");
            newRow[i] = scan.nextInt();
        }
        array = addRow(array, newRowPos, newRow);

        System.out.println("2D Array after adding a new row:");
        printArray(array);

        scan.close();
    }

    // Function to search an element
    public static int[] search(int[][] array, int element) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == element) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Element not found
    }

    // Function to delete an element and reduce column size
    public static int[][] delete(int[][] array, int element) {
        int[] position = search(array, element);

        if (position[0] == -1) {
            System.out.println("Element not found, cannot delete.");
            return array;
        }

        int row = position[0];
        int col = position[1];

        // Create a new row with one less column
        int[] newRow = new int[array[row].length - 1];

        // Copy elements except the deleted one
        for (int i = 0, j = 0; i < array[row].length; i++) {
            if (i != col) {
                newRow[j++] = array[row][i];
            }
        }

        // Replace the original row with the new row
        array[row] = newRow;

        return array;
    }

    // Function to insert an element
    public static int[][] insert(int[][] array, int row, int col, int value) {
        if (row < 0 || row >= array.length) {
            System.out.println("Invalid row index!");
            return array;
        }

        if (col < 0 || col > array[row].length) {
            System.out.println("Invalid column index!");
            return array;
        }

        // Create a new row with one extra column
        int[] newRow = new int[array[row].length + 1];

        // Copy elements before the insert position
        for (int i = 0; i < col; i++) {
            newRow[i] = array[row][i];
        }

        // Insert the new element
        newRow[col] = value;

        // Copy the remaining elements
        for (int i = col; i < array[row].length; i++) {
            newRow[i + 1] = array[row][i];
        }

        // Replace the original row with the new row
        array[row] = newRow;

        return array;
    }

    // Function to add a new row
    public static int[][] addRow(int[][] array, int rowPos, int[] newRow) {
        if (rowPos < 0 || rowPos > array.length) {
            System.out.println("Invalid row position!");
            return array;
        }

        // Create a new array with one extra row
        int[][] newArray = new int[array.length + 1][];

        // Copy rows before the insertion point
        for (int i = 0; i < rowPos; i++) {
            newArray[i] = array[i];
        }

        // Insert the new row
        newArray[rowPos] = newRow;

        // Copy the remaining rows
        for (int i = rowPos; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
    }

    // Utility function to print the 2D array
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
