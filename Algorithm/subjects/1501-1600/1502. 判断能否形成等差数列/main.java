class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // 根据等差数列的性质 2 * arr[1] = arr[0] + arr[1]
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i++) {
            if (2 * arr[i] != arr[i - 1] + arr[i + 1]) return false;
        }
        return true;
    }
}