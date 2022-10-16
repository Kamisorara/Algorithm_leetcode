class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        //边界条件
        dp[0] = nums[0];
        int maxVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + Math.max(dp[i - 1], 0);
            maxVal = Math.max(maxVal, dp[i]);
        }
        return maxVal;
    }
}