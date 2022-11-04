class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        int m = mat.size(), n = mat[0].size();
        vector<int> value(m);
        vector<int> index(m);
        for (int i = 0; i < m; i++) index[i] = i;
        for (int i = 0; i < m; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    cnt++;
                }
            }
            value[i] = cnt;
        }
        sort(index.begin(), index.end(), [&](int a, int b) {
            if (value[a] == value[b] && a < b) {
                return true;
            }
            return value[a] < value[b];
        });

        vector<int> result;
        for (int i = 0; i < k; i++) {
            result.push_back(index[i]);
        }
        return result;
    }
};