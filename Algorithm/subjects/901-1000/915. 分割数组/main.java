class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] minRight = new int[n];
        minRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(nums[i], minRight[i + 1]);
        }

        // for (int i = 0; i < n; i++) {
        //     System.out.println(minRight[i]);
        // }

        int leftMax = 0;
        for (int i = 0; i < n - 1; i++) {
            leftMax = Math.max(leftMax, nums[i]);
            if (leftMax <= minRight[i + 1]) {
                return i + 1;
            }
        }
        return n - 1;
    }
}