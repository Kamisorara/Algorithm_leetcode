import java.util.Arrays;

public class _1460 {
    /**
     * 1460. 通过翻转子数组使两个数组相等
     */
    public boolean canBeEqual(int[] target, int[] arr) {
        int targetLength = target.length;
        int arrLength = arr.length;
        Arrays.sort(target);
        Arrays.sort(arr);
        if (targetLength != arrLength) {
            return false;
        } else {
            for (int i = 0; i < arrLength; i++) {
                if (target[i] != arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
