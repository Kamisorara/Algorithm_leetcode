class Solution {
public:
    bool isAnagram(string s, string t) {
        vector<int> arr1(26), arr2(26);
        if (s.size() != t.size()) {
            return false;
        }
        for (int i = 0; i < s.size(); i++) {
            arr1[s[i] - 'a']++;
            arr2[t[i] - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
};