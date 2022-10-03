import java.util.Arrays;

public class _462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, ret = 0, x = nums[n / 2];
        for (int num : nums) {
            ret += Math.abs(num - x);
        }
        return ret;
    }
}
