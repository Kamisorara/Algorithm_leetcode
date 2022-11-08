class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> res;
        vector<int> target(26);
        for (auto &a : p) {
            target[a - 'a']++;
        }
        int left = 0, right = 0;
        vector<int> window(26);
        while (right < s.size()) {
            window[s[right] - 'a']++;
            if ((right - left + 1) == p.size()) {
                if (window == target) {
                    res.push_back(left);
                }
                window[s[left] - 'a']--;
                left++;
            } 
            right++;
        }
        return res;
    }
};