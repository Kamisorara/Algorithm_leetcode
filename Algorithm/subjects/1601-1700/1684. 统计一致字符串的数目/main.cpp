class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        int n = words.size();
        int cnt = 0;
        vector<int> arr1(26);
        for (auto &s : allowed) {
            arr1[s - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            string word = words[i];
            vector<int> arr2(26);
            for (auto & s : word) {
                if (arr2[s - 'a'] == 1) {
                    continue;
                } else {
                    arr2[s - 'a']++;
                }
            }
            cnt++;
            for (int k = 0; k < 26; k++) {
                if (arr1[k] - arr2[k] < 0) {
                    cnt--;
                    break;
                } 
            }
        }
        return cnt;
    }
};