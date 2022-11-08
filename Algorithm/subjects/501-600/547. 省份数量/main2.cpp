class Solution {
private:
    void dfs(vector<vector<int>> &isConnected, vector<int> &visited, int cities, int i) {
        for (int j = 0; j < cities; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[i] = 1;
                dfs(isConnected, visited, cities, j);
            }
        }
    }
public:
    int findCircleNum(vector<vector<int>>& isConnected) {
        int n = isConnected.size();
        vector<int> visited(n);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, n, i);
                cnt++;
            }
        }
        return cnt;
        
    }
};