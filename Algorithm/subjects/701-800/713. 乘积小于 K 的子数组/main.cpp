class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        int n = nums.size();
        int left = 0;
        int cnt = 0;
        int mul = 1;
        if (k == 1 || k == 0) {
            return cnt;
        }
        for (int right = 0; right < n; right++) {
            mul *= nums[right];
            while (left <= right && mul >= k) {
                mul /= nums[left];
                left++;
            }
            cnt += right - left + 1;
        } 
        return cnt;
    }
};