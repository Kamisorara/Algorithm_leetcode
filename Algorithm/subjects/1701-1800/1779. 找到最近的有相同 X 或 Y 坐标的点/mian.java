class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int res = -1;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int a = point[0], b = point[1];
            if (a == x || b == y) {
                int distant = Math.abs(a - x) + Math.abs(b - y);
                if (distant < min) {
                    res = i;
                    min = distant;
                }
            }
        }
        return res;
    }
}