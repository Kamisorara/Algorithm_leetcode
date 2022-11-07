class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> res;
        int n = nums.size();
        sort(nums.begin(), nums.end());
        for (int k = 0; k < n - 2; k++) {
            if (nums[k] > 0) break;
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int left = k + 1, right = n - 1;
            while (left < right) {
                int num = nums[left] + nums[right] + nums[k];
                if (num < 0) {
                    while (left < right && nums[left] == nums[++left]);
                } else if (num > 0) {
                    while (left < right && nums[right] == nums[--right]);
                } else {
                    res.push_back({nums[left], nums[right], nums[k]});
                    while (left < right && nums[left] == nums[++left]);
                    while (left < right && nums[right] == nums[--right]);
                }
            }
        }
        return res;
    }
};