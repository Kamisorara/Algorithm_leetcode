class Solution {

private:
    vector<vector<int>> res;

public:
    vector<vector<int>> combine(int n, int k) {
        vector<int> path;
        helper(1, n, k, path);
        return res;
    }   

    void helper(int index, int n, int k, vector<int>& path) {
        if (path.size() == k) {
            res.push_back(path);
        }
        for (int i = index; i <= n; i++) {
            path.push_back(i);
            helper(i + 1, n, k, path);
            // 回溯
            path.pop_back();           
        }
    }
};