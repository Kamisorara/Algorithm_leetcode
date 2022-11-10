class Solution {
private:
    int dir[4][2] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    void dfs(vector<vector<char>>& board, int x, int y) {
        board[x][y] = 'A';
        for (int k = 0; k < 4; k++) {
            int newX = x + dir[k][0], newY = y + dir[k][1];
            if (newX < 0 || newX >= board.size() || newY < 0 || newY >= board[0].size()) continue;
            if (board[newX][newY] == 'X' || board[newX][newY] == 'A') continue;
            dfs(board, newX, newY);
        }
    }
public:
    void solve(vector<vector<char>>& board) {
        int m = board.size(), n = board[0].size();
        // step 1
        // from left side and right side
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][n - 1] == 'O') dfs(board, i, n - 1);
        }

        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[m - 1][j] == 'O') dfs(board, m - 1, j);
        }
                
        //step 2
        // up side and down side
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == 'A') board[i][j] = 'O';
            }
        }
    }
};