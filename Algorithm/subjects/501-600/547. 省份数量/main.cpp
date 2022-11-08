class Solution {
public:
    int findCircleNum(vector<vector<int>>& isConnected) {
        int n = isConnected.size();
        vector<int> visited(n);
        int cnt = 0;
        queue<int> q;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                q.push(i);
                while (!q.empty()) {
                    int j = q.front(); q.pop();
                    visited[j] = 1;
                    for (int k = 0; k < n; k++) {
                        if (isConnected[j][k] == 1 && !visited[k]) {
                            q.push(k);
                        }
                    }
                }
                cnt++;
            }
        }
        return cnt;
    }
};