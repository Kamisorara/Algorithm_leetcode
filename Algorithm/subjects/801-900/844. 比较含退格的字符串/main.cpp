class Solution {
public:
    bool backspaceCompare(string s, string t) {
        string a = "";
        string b = "";
        for (auto & str : s) {
            if (str == '#') {
                if (!a.empty()) a.erase(a.end() - 1);        
            } else {
                a += str;
            }
        }

        for (auto &str : t) {
            if (str == '#') {
                if (!b.empty()) b.erase(b.end() - 1);   
            } else {
                b += str;
            }
        }
        return a == b;
    }
};