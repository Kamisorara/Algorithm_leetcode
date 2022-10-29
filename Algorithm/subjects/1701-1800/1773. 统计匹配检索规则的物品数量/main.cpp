class Solution {
public:
    int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) {
        int n = items.size();
        unordered_map<string, int> hashmap{
            {"type", 0},
            {"color", 1},
            {"name", 2}
        };
        int res = 0;
        int index = hashmap[ruleKey];
        for (int i = 0; i < n ;i++) {
            string item = items[i][index];
            if (!item.compare(ruleValue)) {
                res++;
            }
        }
        return res;
    }
};