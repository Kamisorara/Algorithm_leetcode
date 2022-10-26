// DFS + BFS
class Solution {
private:
    int dir[4][2]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    void dfs(vector<vector<int>>& grid, int r, int c, queue<int>& q) {
        int m = grid.size();
        int n = grid[0].size();
        grid[r][c] = 2;
        q.push(r * n + c);
        for (int k = 0; k < 4; k++) {
            int row = r + dir[k][0], col = c + dir[k][1];
            if (row < 0 || row >= m || col < 0 || col >=n ) continue;
            if (grid[row][col] == 0 || grid[row][col] == 2) continue;
            if (grid[row][col] == 1) dfs(grid, row, col, q);
        }
    }

public:
    int shortestBridge(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        queue<int> q;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i ,j, q);
                    int step = 0;
                    while (!q.empty()) {
                        int size  = q.size();
                        for (int p = 0; p < size; p++) {
                            int curr = q.front(); q.pop();
                            int x = curr / n, y = curr % n;
                            for (int k = 0; k < 4; k++) {
                                int row = x + dir[k][0], col = y + dir[k][1];
                                if (row < 0 || row >= m || col < 0 || col >=n ) continue;
                                if (grid[row][col] == 2) continue;
                                if (grid[row][col] == 1) return step;
                                q.push(row * n + col);
                                grid[row][col] = 2;
                            }
                        }
                        step++;
                    }
                }
            }
        }
        return 0;
    }
};