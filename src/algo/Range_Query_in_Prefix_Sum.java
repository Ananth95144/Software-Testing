package algo;
import java.util.Scanner;
 
public class Range_Query_in_Prefix_Sum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of queries:");
        int q = scanner.nextInt();
 
        for (int k = 0; k < q; k++) {
            System.out.println("Enter range (i and j):");
            int i = scanner.nextInt();
            int j = scanner.nextInt();
 
            int rangeSum = prefixSum[j] - ( prefixSum[i - 1]);
            System.out.println("Sum from index " + i + " to " + j + " is: " + rangeSum);
        }
 
        scanner.close();
    }
}
 
 
 