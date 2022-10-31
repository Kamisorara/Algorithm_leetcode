class Solution {
public:
    string get(string word) {
        string res;
        for (int i = 0; i < word.size() - 1; i++) {
            res += word[i + 1] - word[i];
        }
        return res;
    }
    string oddString(vector<string>& words) {
        unordered_map<string, int> hashmap;
        for (auto& a : words) hashmap[get(a)]++;
        for (auto& a : words) {
            if (hashmap[get(a)] == 1) {
                return a;
            }
        }
        return "";
    }
};