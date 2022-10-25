class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int peoples = accounts.size();
        int maxVal = INT_MIN;
        for (int i = 0; i < peoples; i++) {
            int temp = 0;
            vector<int> tempList = accounts[i];
            for (int j = 0; j < tempList.size(); j++) {
                temp += tempList[j];
            }
            maxVal = max(maxVal, temp);
        }
        return maxVal;
    }
};