class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int left = 0, right = n - 1;
        int maxVal = 0;
        while (left < right) {
            int area = min(height[left], height[right]) * (right - left);
            maxVal = max(area, maxVal);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxVal;
    }
};