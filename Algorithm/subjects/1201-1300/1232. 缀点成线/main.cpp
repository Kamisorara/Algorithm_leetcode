class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& c) {
        int n = c.size();
        // (y1 - y0) / (x1 - x0) == (yi - y0) / (xi - x0)
        // 因为可能出现 除数为零的情况 , 保险起见写成乘号
        // 解方程嘛就是左边挪到右边 , 右边挪到左边
        int x0 = c[0][0], y0 = c[0][1];
        int x1 = c[1][0], y1 = c[1][1];
        for (int i = 2; i < c.size(); i++) {
            if ((y1 - y0) * (c[i][0] - c[i - 1][0]) != (c[i][1] - c[i - 1][1]) * (x1 - x0)) {
                return false;
            }
        }
        return true;
    }
};