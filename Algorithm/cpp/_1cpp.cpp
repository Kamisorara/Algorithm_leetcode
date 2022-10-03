#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    //暴力
    vector<int> twoSum(vector<int> &nums, int target) {
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return {i, j};
                }
            }
        }
        return {};
    }

    //hashTable
    vector<int> twoSum2(vector<int> &nums, int target) {
        unordered_map<int, int> hashTable;
        for (int i = 0; i < nums.size(); ++i) {
            auto it = hashTable.find(target - nums[i]);
            if (it != hashTable.end()) {
                return {it->second, i};
            }
            hashTable[nums[i]] = i;
        }
        return {};
    }
};
