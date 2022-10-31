class Solution {
public:
    void traceBack(vector<string>& res, int index, string& output, int len) {
        res.push_back(output);
        for (int i = index; i < len; i++) {
            // 如果是字母
            if (!isdigit(output[i])) {
                if (islower(output[i])) {
                    output[i] = toupper(output[i]);
                    traceBack(res, i + 1, output, len);
                    // 撤销
                    output[i] = tolower(output[i]);
                } else {
                    output[i] = tolower(output[i]);
                    traceBack(res, i + 1, output, len);
                    // 撤销
                    output[i] = toupper(output[i]);
                }
            }
        }
    }

    vector<string> letterCasePermutation(string s) {
        vector<string> res;
        traceBack(res, 0, s, s.size());
        return res;
    }
};