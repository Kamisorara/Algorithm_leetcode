class Solution {
public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int direction[4][2]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int m = grid.size();
        int n = grid[0].size();
        int maxArea = 0;
        for (int i = 0; i <m; i++){
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue<int> q;
                    grid[i][j] = 0;
                    int temp = 1;
                    q.push(i * n +  j);
                    while (!q.empty()) {
                        int curr = q.front(); q.pop();
                        int x = curr / n, y = curr % n;
                        for (int k = 0; k < 4; k++) {
                            int row = x + direction[k][0], col = y + direction[k][1];
                            if (row < 0 || row >= m || col < 0 || col >= n) {
                                continue;
                            }
                            if (grid[row][col] == 0) continue;
                            if (grid[row][col] == 1) {
                                temp++;
                                q.push(row * n + col);
                                grid[row][col] = 0;
                            }
                        }
                    }
                    maxArea =max(maxArea, temp);
                }
            }
        }
        return maxArea;
    }
};