class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // left 要 <= right
        while (left <= right) {
            // 不能使用 (left + right) / 2 因为当left 和 right 都是 int类型的一半以上时，相加会超过 int 类型的极限就会发生溢出
            int mid = left + (right - left) / 2;
            int num = nums[mid];
            if (num < target) {
                left = mid + 1;
            } else if (num > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}