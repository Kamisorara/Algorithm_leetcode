class Solution {
private:
    // 寻找左边界
    int getLeftBorder(vector<int>& nums, int target) {
        int left = 0, right = nums.size() - 1;
        int leftBorder = -2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
                leftBorder = right;
            }
        }
        return leftBorder;
    }

    // 寻找右边界
    int getRightBorder(vector<int>& nums, int target) {
        int left = 0, right = nums.size() - 1;
        int rightBorder = -2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
                rightBorder = left;
            } else {
                right = mid - 1;
            }
        }
        return rightBorder;
    }
    
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);
        // 如果有一个边界 超过了
        if (leftBorder == -2 || rightBorder == -2) {
            return {-1, -1};
        }
        // 存在target 且在范围内
        if (rightBorder - leftBorder > 1) {
            return {leftBorder + 1, rightBorder - 1};
        }
        // 在范围内但是没有这个target
        return {-1, -1};
    }
};