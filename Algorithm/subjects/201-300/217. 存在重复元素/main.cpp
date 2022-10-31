#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    /**
     * 217 存在重复元素
     */
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        for(int i = 0;i < nums.size() - 1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        
        
        return false;
        
    }

    bool containsDuplicate(vector<int>& nums) {
        int n = nums.size();
        unordered_set<int> hashset;
        for (int i = 0; i < n; i++) {
            hashset.insert(nums[i]);
        }
        return hashset.size() != n;
    }
    
    

};
