#include <bits/stdc++.h>

using namespace std;

class Solution {
    /**
    *买卖股票的最佳时机 II
    */
public:
    // dp
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
    //dp 优化
    int maxProfit2(vector<int>& prices) {
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
    //贪心
    int maxProfit3(vector<int>& prices) {
        //贪心
        if(prices.empty() || prices.size()<2){
            return 0;
        }
        int total = 0,index = 0,length = prices.size();
        while(index <length){
            //开始寻找股票上涨的点(如果找不到就一直找)
            while(index<length-1 && prices[index]>= prices[index+1]){
                index++;
            }
            //此时找到了上涨的最小点
            int min = prices[index];
            //找股票上涨的最大点直到为止
            while(index < length-1 && prices[index] <= prices[index+1]){
                index++;
            }
            //此时找到了股票上涨的最大点 index++
            int max = prices[index++];
            total += max-min;
        }
        return total;
    }
};
