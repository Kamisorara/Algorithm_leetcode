class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        int n = triangle.size();
        vector<vector<int>> dp(n, vector<int>(n));
        dp[0][0] = triangle[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                int val = triangle[i][j];
                dp[i][j] = INT_MAX;
                if (j != 0) {
                    dp[i][j] = min(dp[i][j], dp[i - 1][j - 1] + val);
                }
                if (j != i) {
                    dp[i][j] = min(dp[i][j], dp[i - 1][j] + val);
                }
            }
        }

        int minVal = INT_MAX;
        // 在dp数组中查找最小的
        for (int i = 0; i < n; i++) {
            minVal = min(minVal, dp[n - 1][i]);
        }
        return minVal;

    }
};