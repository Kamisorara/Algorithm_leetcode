class Solution {
private:
    vector<string> getPosition(string &s) {
        int n = s.size();
        if (n == 1) {
            return {s};
        }
        if (s[0] == '0' && s[n - 1] == '0') {
            return {};
        }
        if (s[n - 1] == '0') return {s};
        if (s[0] == '0') {
            return {"0." + s.substr(1)};
        }
        vector<string> res;
        res.push_back(s);
        for (int i = 1; i < n; i++) {
            string a = s.substr(0, i);
            string b = s.substr(i);
            res.push_back(a + "." + b);
        }
        return res;

    }
public:
    vector<string> ambiguousCoordinates(string s) {
        s = s.substr(1, s.size() - 2);
        int n = s.size();
        vector<string> res;
        for (int i = 1; i < n; i++) {
            string l = s.substr(0, i);
            string r = s.substr(i);
            vector<string> left = getPosition(l);
            vector<string> right = getPosition(r);
            for (auto &x : left) {
                for (auto &y : right) {
                    res.push_back("(" + x + ", " + y + ")");
                }
            }
        }
        return res;
    }
};