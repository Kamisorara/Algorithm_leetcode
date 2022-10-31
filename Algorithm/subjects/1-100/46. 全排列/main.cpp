class Solution {
public:
    void traceBack(vector<vector<int>>& res, vector<int>& output, int index, int len) {
        if (index == len) {
            res.push_back(output);
            return;
        }
        for (int i = index; i < len; i++) {
            swap(output[i], output[index]);
            traceBack(res, output, index + 1, len);
            // 撤销操作
            swap(output[i], output[index]);
        }
    }

    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> res;
        int len = nums.size();
        traceBack(res, nums, 0, len);
        return res;
    }
};