class Solution {
public:
    int countDistinctIntegers(vector<int>& nums) {
        set<int> sets;
        vector<int> temp;
        for (int num : nums) {
            temp.push_back(num);   
        }
        for (int num : nums) {
            string s = to_string(num);
            std::reverse(s.begin(), s.end());
            int rNum = stoi(s);
            temp.push_back(rNum);
        }
        for (int i = 0;i < temp.size(); i++) {
            sets.insert(temp[i]);
        }
        return sets.size();
    }
};