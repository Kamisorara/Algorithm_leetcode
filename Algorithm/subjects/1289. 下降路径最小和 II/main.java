class Solution {
    // 时间复杂度O(n * 3)
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        int minVal = Integer.MAX_VALUE;
        // 边界条件
        for (int k = 0; k < n; k++) {
            dp[0][k] = grid[0][k];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    //当下表不同时才能进行状态更新
                    if (k != j) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + val);
                    }
                }
            }
        }
        //dp 数组最后一行找到最小的
        for (int k = 0; k < n; k++) {
            minVal = Math.min(minVal, dp[n - 1][k]);
        }
        return minVal;
    }
}