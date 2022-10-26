class Solution {
public:
    char findTheDifference(string s, string t) {
        if (s == "") {
            return t[0];
        }
        vector<int> arr1(26,0);
        for (int i = 0; i < s.size(); i++) {
            arr1[s[i] - 'a']++;
        }
        for (int i = 0; i < t.size(); i++) {
            arr1[t[i] - 'a']--;
            if (arr1[t[i] - 'a'] < 0) {
                return t[i];
            }
        }
        return s[0];
        
    }
};