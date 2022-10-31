class Solution {
public:
    int rob(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> dp(nums.size(), vector<int>(2));
        // 边界条件
        // dp[i][0] 表示该家没偷
        // dp[i][1] 表示该家偷了
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.size(); i++) {
            
            dp[i][0] = max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = max(dp[i - 1][1], dp[i - 1][0] + nums[i]);
        }
        return max(dp[n - 1][0], dp[n - 1][1]);
    }
};