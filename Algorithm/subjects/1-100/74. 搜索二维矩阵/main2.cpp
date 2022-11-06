class Solution {
private:
    int binarySearchRow(vector<vector<int>> &matrix, int target) {
        int low = -1, heigh = matrix.size() - 1;
        while (low < heigh) {
            int mid = low + (heigh - low + 1) / 2;
            if (matrix[mid][0] <= target) {
                low = mid;
            } else {
                heigh = mid - 1;
            }
        }
        return low;
    }

    int binarySearchTarget(vector<int> &rowDetail, int target) {
        int left = 0, right = rowDetail.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (rowDetail[mid] < target) {
                left = mid + 1;
            } else if (rowDetail[mid] > target) {
                right = mid - 1;
            } else {
                return true; 
            }
        }
        return false;
    }           

public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = binarySearchRow(matrix, target);
        if (row < 0) return false;
        return binarySearchTarget(matrix[row], target);
    }
};