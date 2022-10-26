class Solution {
// DFS
private:
    int dir[4][2]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    void dfs(vector<vector<char>>& grid, int r, int c) {
        int m = grid.size();
        int n = grid[0].size();
        grid[r][c] = '0';
        for (int k = 0; k < 4; k++) {
            int row = r + dir[k][0], col = c + dir[k][1];
            if (row < 0 || row >= m || col < 0 || col >=n ) continue;
            if (grid[row][col] == '1') dfs(grid, row, col);
        }
    }
public:
    int numIslands(vector<vector<char>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        int islands = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }
        return islands;
        
    }
};