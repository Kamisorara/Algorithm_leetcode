class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int left = 0, right = length - 1;
        int sum = -1;
        while (left < right) {
            int temp = (right - left) * (Math.min(height[left],height[right]));
            sum = Math.max(sum, temp);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return sum;
    }
}