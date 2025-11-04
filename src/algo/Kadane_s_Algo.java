package algo;
class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
 
        for (int i = 0; i < nums.length; i++) {
            int temp = curSum + nums[i];
            if (temp < nums[i]) {
                curSum = nums[i];
            } else {
                curSum = temp;
            }
            if (maxSum < curSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
    }
}
public class Kadane_s_Algo  {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = solution.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}