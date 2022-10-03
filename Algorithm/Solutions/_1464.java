public class _1464 {
    /**
     * 1464. 数组中两元素的最大乘积
     * 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
     * 请你计算并返回该式的最大值。
     */

    public int maxProduct(int[] nums) {
        int maxResult = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int temp = (nums[i] - 1) * (nums[j] - 1);
                    if (temp > maxResult) {
                        maxResult = temp;
                    }
                }

            }
        }
        return maxResult;
    }
}
