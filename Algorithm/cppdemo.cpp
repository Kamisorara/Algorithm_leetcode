# include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int climbStairs(int n) {
        vector<int> dp(n);
        if (n == 1) {
            return 1;
        }
        // 边界条件
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        } 
        return dp[n];
    }
};