class Solution {
public:
    int maxRepeating(string sequence, string word) {
        string s = word;
        int cnt = 0;
        while (sequence.find(s) != string::npos) {
            s += word;
            cnt++;
        }
        return cnt;
    }
};