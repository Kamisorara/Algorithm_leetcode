public class _670 {
    //    670.最大交换
    class Solution {
        public int maximumSwap(int num) {
            if (num % 10 == num) return num;

            char[] arr = String.valueOf(num).toCharArray();
            for (int i = 0; i < arr.length; i++) {
                // 从i后面选择一个最大的，这个最大的离i越远越好，比如1993，1交换第二个9更优，所以j倒序遍历
                int maxIndex = i;
                for (int j = arr.length - 1; j >= i + 1; j--) {
                    if (arr[j] > arr[maxIndex]) {
                        maxIndex = j;
                    }
                }

                if (maxIndex != i) {
                    char tmp = arr[i];
                    arr[i] = arr[maxIndex];
                    arr[maxIndex] = tmp;
                    return Integer.parseInt(new String(arr));
                }
            }

            return num;
        }
    }

}
