class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.size();
        int left = 0;
        int res = 0;
        unordered_set<char> uset;
        for (int right = 0; right < n; right++) {
            while (uset.find(s[right]) != uset.end()) {
                uset.erase(s[left]);
                left++;
            }
            res = max(res, right - left + 1);
            uset.insert(s[right]);
        }
        return res;
    }
};