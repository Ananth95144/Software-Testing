package algo;
public class SlidingWindows {
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            System.out.println("Invalid input: Array size is smaller than window size.");
            return -1;
        }
        int maxSum = 0, windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
 
        return maxSum;
    }
 
    public static void main(String[] args) {
        int[] bestCase = {1, 2, 3, 4, 5};       
        int[] avgCase = {3, 7, 2, 9, 6, 1, 8};  
        int[] worstCase = {5, 4, 3, 2, 1};      
 
        int k = 3;
 
        System.out.println("Best Case: " + maxSumSubarray(bestCase, k));   // O(n)
        System.out.println("Average Case: " + maxSumSubarray(avgCase, k)); // O(n)
        System.out.println("Worst Case: " + maxSumSubarray(worstCase, k)); // O(n)
    }
}
 
 
 