package algo;
public class Prefix_Sum_Basic {
    public static int[] calculatePrefixSum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
 
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
 
        return prefixSum;
    }
 
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5};
        int[] prefixSum = calculatePrefixSum(nums);
 
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
    }
}
 
 
 