class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //排序
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[0] + nums[1] + nums[2];
        for (int k = 0; k < n; k++) {
            int left = k + 1, right = n - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                }
                if (target > sum) {
                    left++;
                } else if (target < sum) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return ans;
    }
}