class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int m = word1.size();
        int n = word2.size();
        int left = 0, right = 0;
        string res = "";
        while (left < m || right < n) {
            if (left < m) {
                res.push_back(word1[left]);
                left++;
            }
            if (right < n) {
                res.push_back(word2[right]);
                right++;
            }
        }
        return res;
    }

    string mergeAlternately(string word1, string word2) {
        int m = word1.size();
        int n = word2.size();
        int left = 0, right = 0;
        string res = "";
        while (left < m || right < n) {
            if (left < m) {
                res += word1[left];
                left++;
            }
            if (right < n) {
                res += word2[right];
                right++;
            }
        }
        return res;
    }
};