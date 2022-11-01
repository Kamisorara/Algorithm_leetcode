class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        int n1 = word1.size();
        int n2 = word2.size();
        string s1;
        string s2;
        for (auto& str : word1) {
            s1 += str;
        }
        for (auto& str : word2) {
            s2 += str;
        }
        return s1 == s2;
    }
};