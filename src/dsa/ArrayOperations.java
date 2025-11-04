package dsa;
import java.util.Scanner;

public class ArrayOperations {
    private static final int MAX_SIZE = 100; // Maximum size of the array
    private static int[] array = new int[MAX_SIZE]; // Fixed-size array
    private static int size = 0; // Current number of elements in the array

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Search an element");
            System.out.println("2. Insert at the beginning");
            System.out.println("3. Insert at the end");
            System.out.println("4. Insert at a specific position");
            System.out.println("5. Delete from the beginning");
            System.out.println("6. Delete from the end");
            System.out.println("7. Delete from a specific position");
            System.out.println("8. Update an element");
            System.out.println("9. Print the array");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Search an element
                    System.out.print("Enter the element to search: ");
                    int searchElement = scanner.nextInt();
                    int index = search(searchElement);
                    if (index != -1) {
                        System.out.println("Element found at index: " + index);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 2:
                    // Insert at the beginning
                    System.out.print("Enter the element to insert at the beginning: ");
                    int insertBeginElement = scanner.nextInt();
                    insertAtBeginning(insertBeginElement);
                    System.out.println("Array after insertion: ");
                    printArray();
                    break;

                case 3:
                    // Insert at the end
                    System.out.print("Enter the element to insert at the end: ");
                    int insertEndElement = scanner.nextInt();
                    insertAtEnd(insertEndElement);
                    System.out.println("Array after insertion: ");
                    printArray();
                    break;

                case 4:
                    // Insert at a specific position
                    System.out.print("Enter the element to insert: ");
                    int insertElement = scanner.nextInt();
                    System.out.print("Enter the position to insert: ");
                    int insertPosition = scanner.nextInt();
                    if (insertPosition >= 0 && insertPosition <= size) {
                        insertAtPosition(insertElement, insertPosition);
                        System.out.println("Array after insertion: ");
                        printArray();
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 5:
                    // Delete from the beginning
                    deleteFromBeginning();
                    System.out.println("Array after deletion: ");
                    printArray();
                    break;

                case 6:
                    // Delete from the end
                    deleteFromEnd();
                    System.out.println("Array after deletion: ");
                    printArray();
                    break;

                case 7:
                    // Delete from a specific position
                    System.out.print("Enter the position to delete: ");
                    int deletePosition = scanner.nextInt();
                    if (deletePosition >= 0 && deletePosition < size) {
                        deleteFromPosition(deletePosition);
                        System.out.println("Array after deletion: ");
                        printArray();
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 8:
                    // Update an element
                    System.out.print("Enter the position to update: ");
                    int updatePosition = scanner.nextInt();
                    System.out.print("Enter the new element: ");
                    int newElement = scanner.nextInt();
                    if (updatePosition >= 0 && updatePosition < size) {
                        updateElement(updatePosition, newElement);
                        System.out.println("Array after update: ");
                        printArray();
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 9:
                    // Print the array
                    System.out.println("Current Array: ");
                    printArray();
                    break;

                case 10:
                    // Exit
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to print the array
    public static void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to search an element in the array
    public static int search(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }

    // Method to insert an element at the beginning
    public static void insertAtBeginning(int element) {
        if (size == MAX_SIZE) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }
        // Shift all elements to the right
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = element;
        size++;
    }

    // Method to insert an element at the end
    public static void insertAtEnd(int element) {
        if (size == MAX_SIZE) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }
        array[size] = element;
        size++;
    }

    // Method to insert an element at a specific position
    public static void insertAtPosition(int element, int position) {
        if (size == MAX_SIZE) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }
        // Shift elements to the right from the given position
        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = element;
        size++;
    }

    // Method to delete an element from the beginning
    public static void deleteFromBeginning() {
        if (size == 0) {
            System.out.println("Array is empty. Cannot delete.");
            return;
        }
        // Shift all elements to the left
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // Method to delete an element from the end
    public static void deleteFromEnd() {
        if (size == 0) {
            System.out.println("Array is empty. Cannot delete.");
            return;
        }
        size--;
    }

    // Method to delete an element from a specific position
    public static void deleteFromPosition(int position) {
        if (size == 0) {
            System.out.println("Array is empty. Cannot delete.");
            return;
        }
        // Shift elements to the left from the given position
        for (int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // Method to update an element at a specific position
    public static void updateElement(int position, int newElement) {
        array[position] = newElement;
    }
}