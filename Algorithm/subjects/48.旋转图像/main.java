class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];
        int[][] ans = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                temp[j][i] = matrix[i][j];
            }
        }
        //翻转数组操作
        for (int i = 0; i < n; i++) {
            int[] tempArray = new int[n];
            //翻转
            for (int j = 0, k = n - 1; j < n; j++) {
                tempArray[j] = temp[i][k];
                k--;
            }
            ans[i] = tempArray;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}