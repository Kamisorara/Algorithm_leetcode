package 模拟题;

/**
 * 给你一个整数数组 nums，将 nums 中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。
 * <p>
 * 返回满足此条件的 任一数组 作为答案。
 */
public class _905 {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        }
        int k = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
//将偶数先放到前面
            if (nums[i] % 2 == 0) {
                result[k] = nums[i];
                k++;

            }
        }
        for (int i = 0; i < nums.length; i++) {
//将奇数先放到后面
            if (nums[i] % 2 != 0) {
                result[k] = nums[i];
                k++;
            }
        }
        return result;

    }
}
