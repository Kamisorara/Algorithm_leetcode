public class _1608 {
    /**
     * 1608. 特殊数组的特征值
     */
    public int specialArray(int[] nums) {
        for (int i = 1; i <= nums.length; i++) {
            int ans = 0;
            for (int num : nums) {
                if (num >= i) {
                    ans++;
                }
            }
            if (ans == i) {
                return i;
            }
        }
        return -1;
    }
}
