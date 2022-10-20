class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int minVal = Integer.MAX_VALUE;
        int n = matrix.length;
        int[][] dp = new int[n][n];
        //边界条件
        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                int val = matrix[i][j];
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][j] + val, dp[i - 1][j + 1] + val);
                } else if (j == n - 1) {
                    dp[i][j] = Math.min(dp[i - 1][j] + val, dp[i - 1][j - 1] + val);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + val, Math.min(dp[i - 1][j - 1] + val, dp[i - 1][j + 1] + val));
                }
            }
        }

        for (int k = 0; k < n; k++) {
            minVal = Math.min(minVal, dp[n - 1][k]);
        }
        return minVal;
    }
}