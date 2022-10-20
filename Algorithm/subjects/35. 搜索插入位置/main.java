class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        // 数组中没有出现该数字
        for (int i = 0; i < n; i++) {
            if (target < nums[i]) {
                return i;
            }
        }
        return n;
    }
}