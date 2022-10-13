class Solution {
    public int maxAscendingSum(int[] nums) {
        int numLengh = nums.length;
        int max = nums[0];
        int temp = nums[0];
        for (int i = 0; i < numLengh - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                temp += nums[i + 1];
            } else {
                temp = nums[i + 1];
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}