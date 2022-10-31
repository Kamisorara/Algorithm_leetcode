class Solution {
public:
    bool check(string& a, string& b) {
        int cnt = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a[i] != b[i]) {
                cnt++;
            }
        }
        return cnt <= 2;
    }

    vector<string> twoEditWords(vector<string>& queries, vector<string>& dictionary) {
        vector<string> res;
        for (string& a : queries) {
            for (string& b : dictionary) {
                if (check(a, b)) {
                    res.push_back(a);
                    break;
                }
            }
        }
        return res;
    }
};