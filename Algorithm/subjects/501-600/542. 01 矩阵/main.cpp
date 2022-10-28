class Solution {
private:
    int dir[4][2]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
public:
    vector<vector<int>> updateMatrix(vector<vector<int>>& mat) {
        int m = mat.size(), n = mat[0].size();
        queue<pair<int, int>> q;
        vector<vector<int>> dist(m, vector<int>(n, INT_MAX));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    q.push({i, j});
                    dist[i][j] = 0;
                }
            }
        }
        
        while(!q.empty()) {
            int x = q.front().first, y = q.front().second;
            q.pop();
            for (int k = 0; k < 4; k++) {
                int row = x + dir[k][0], col = y + dir[k][1];
                if (row >= 0 && row < m && col >=0 && col < n) {
                    if (dist[row][col] > dist[x][y] + 1) {
                        dist[row][col] = dist[x][y] + 1;
                        q.push({row, col});
                    }
                }
            } 
        }
        return dist;
    }
};