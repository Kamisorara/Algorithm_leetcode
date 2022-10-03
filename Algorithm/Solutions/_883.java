/**
 * 883. 三维形体投影面积
 */
public class _883 {
    public int projectionArea(int[][] grid) {
        //xy面积
        int xy = 0, zx = 0, yz = 0, sum = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            int a = 0, b = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    xy++;
                }
                a = Math.max(a, grid[i][j]);//左视图
                b = Math.max(b, grid[j][i]);//主视图
            }
            yz += a;
            zx += b;
        }
        sum = xy + zx + yz;
        return sum;
    }
}
