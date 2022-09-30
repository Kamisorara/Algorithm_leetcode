#include <bits/stdc++.h>

using namespace std;

class Solution {
    /**
    *买卖股票的最佳时机 II
    */
public:
    int maxProfit(vector<int>& prices) {
        if(prices.empty() || prices.size()<2){
            return 0;
        }
        int noHold = 0;
        int hold = -prices[0];
        for(int i = 0;i<prices.size();i++){
            noHold = max(noHold,hold+prices[i]);
            hold = max(hold,noHold-prices[i]);
        }
        return noHold;
    }
};
