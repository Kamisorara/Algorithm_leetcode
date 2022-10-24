class Solution {
public:
    int findMaxK(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        unordered_map<int,int> map;
        vector<int> temp;
        for (int num : nums) {
            map[num] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (map.count(-nums[i])) {
                temp.push_back(nums[i]);
            }
        }
        if (temp.size() < 1) {
            return -1;
        } else {
            sort(temp.begin(),temp.end());
            return temp[temp.size() - 1];
        }
        
    }
};