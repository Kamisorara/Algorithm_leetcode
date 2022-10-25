class Solution {
public:
    int shortestBridge(vector<vector<int>>& grid) {
        // 上下左右走动的四个方向
        int direction[4][2]{{0, 1}, {0, -1}, {1 ,0}, {-1, 0}};
        int n = grid.size(), m = grid[0].size();
        queue<int> q1, q2; // q1 第一遍广搜使用， q2 用来记录要拿来扩建的值
        // 随便找一个岛 (为第一次BFS做准备)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    q1.push(i * n + j);
                    // 将这个岛标记为2 表示已经搜索过
                    grid[i][j] = 2;
                    break;
                }
            }
            if (!q1.empty()) break;
        }
        // 将第一个岛所有点入队
        while (!q1.empty()) {
            int curr = q1.front(); q1.pop(); q2.push(curr);
            int x = curr / n;
            int y = curr % n;
            for (int k = 0; k < 4; k++) {
                int row = x + direction[k][0];
                int col = y + direction[k][1];
                // 碰到边界
                if (row < 0 || row >= n || col < 0 || col >= n) continue;
                if (grid[row][col] == 0) continue;
                if (grid[row][col] == 2) continue;
                q1.push(row * n + col);
                // 将扫过的第一座到标记为 2
                grid[row][col] = 2;
            }
        }

        // 分步BFS
        for (int step = 0; !q2.empty(); step++) {
            cout << "外循环:" <<  q2.size() << endl;
            for (int p = 0, s = q2.size(); p < s; p++) {
                cout << "内循环:" <<q2.size() << endl;
                int curr = q2.front(); q2.pop();
                int x = curr / n;
                int y = curr % n;
                for (int k = 0; k < 4; k++) {
                    int row = x + direction[k][0];
                    int col = y + direction[k][1];
                    if (row < 0 || row >=n || col < 0 || col >= n) continue;
                    if (grid[row][col] == 2) continue;
                    if (grid[row][col] == 1) return step;
                    q2.push(row * n + col);
                    grid[row][col] = 2;
                }
            }
        }
        return -1;
    }
};