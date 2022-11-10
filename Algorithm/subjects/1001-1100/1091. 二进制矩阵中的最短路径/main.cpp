class Solution {
private:
    const int dx[8] = {1, -1, -1, 1, 0, 1, -1, 0};
    const int dy[8] = {-1, -1, 1, 1, -1, 0, 0, 1};
public:
    int shortestPathBinaryMatrix(vector<vector<int>> &grid) {
        // 如果左上角为 1 return -1
        if (grid[0][0]) {
            return -1;
        }
        int n = grid.size();
        int res = 1;
        if (n == 1) {
            return 1;
        }
        queue<pair<int, int>> q;
        q.push(make_pair(0, 0));
        // 添加完之后防止重复找到0 把之前的0转换成1
        grid[0][0] = 1;
        while (!q.empty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                auto [x, y] = q.front(); q.pop();
                if (x == n - 1 && y == n - 1) return res;
                for (int k = 0; k < 8; k++) {
                    int newX = x + dx[k];
                    int newY = y + dy[k];
                    if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                        // 判断是否能走
                        if (grid[newX][newY] == 0) {
                            q.push(make_pair(newX, newY));
                            grid[newX][newY] = 1;
                        }
                    }
                }
            }
            res++;
        }
        return -1;
    }
};