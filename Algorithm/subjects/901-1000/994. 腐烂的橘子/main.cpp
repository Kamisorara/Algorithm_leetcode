class Solution {
private:
    int dir[4][2]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
public:
    int orangesRotting(vector<vector<int>>& grid) {
        int m = grid.size(), n = grid[0].size();
        int time = 0;
        // 新鲜橘子数量
        int count = 0;
        queue<pair<int, int>> q;
        // 找到所有的烂橘子
        for (int i = 0; i < m; i++) {
            for (int j = 0;  j < n; j++) {
                if (grid[i][j] == 2) {
                    q.push({i ,j});
                } else if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        if (count == 0) {
            return 0;
        }
        while (count > 0 && !q.empty()) {
            time++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int x = q.front().first, y = q.front().second;
                q.pop();
                for (int k = 0; k < 4; k++) {
                    int row = x + dir[k][0];
                    int col = y + dir[k][1]; 
                    if (row >= 0 && row < m && col >= 0 && col < n) {
                        if (grid[row][col] == 1) {
                            q.push({row, col});
                            grid[row][col] = 2;
                            count--;
                        }
                        if (grid[row][col] == 0) continue;
                    }
                }
            }
        }
        return count > 0 ? -1 : time;
    }
};