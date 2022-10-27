class Solution {
public:
    string toLowerCase(string s) {
        int n = s.size();
        string res = "";
        for (int i = 0; i <n; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                char newChar = s[i] + 32;
                res += newChar;
            } else {
                res += s[i];
            }
        }
        return res;
    }
};