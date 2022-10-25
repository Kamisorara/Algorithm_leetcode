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

    //优化时间复杂度 O(n * 2)
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        int i1 = -1, i2 = -1;
        // 定义初始状态
        for (int i = 0; i < n; i++) {
            //选出一个最小值和一个次小值
            int val = grid[0][i];
            dp[0][i] = val;
            if (val < (i1 == -1 ? Integer.MAX_VALUE : dp[0][i1])) {
                i2 = i1;
                i1 = i;
            } else if (val < (i2 == -1 ? Integer.MAX_VALUE : dp[0][i2])) {
                i2 = i;
            }
        }
        // 将剩下的进行状态转移
        for (int i = 1; i < n; i++) {
            // 定义两个暂时的最小值和次小值
            int tempI1 = -1, tempI2 = -1;
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                dp[i][j] = Integer.MAX_VALUE;
                // 能选择最小值的选择最小值
                if (j != i1) {
                    dp[i][j] = dp[i - 1][i1] + val;
                    //不能选择最小值的选择次小值
                } else {
                    dp[i][j] = dp[i - 1][i2] + val;
                }
                if (val < (tempI1 == -1 ? Integer.MAX_VALUE : dp[i][tempI1])) {
                    tempI2 = tempI1;
                    tempI1 = j;
                } else if (val < (tempI2 == -1 ? Integer.MAX_VALUE : dp[i][tempI2])) {
                    tempI2 = j;
                }
            }
            i1 = tempI1;
            i2 = tempI2;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, dp[n - 1][i]);
        }
        return ans;

    }
}