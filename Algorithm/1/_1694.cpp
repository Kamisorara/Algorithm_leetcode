#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    /**
     * 1694. 重新格式化电话号码
     */
    string reformatNumber(string number) {
        string ans;
        int n = number.size();
        string digits;
        for (char ch : number) {
            if (isdigit(ch)) {
                digits.push_back(ch);
            }
        }
        int nums = digits.size();
        int index = 0;
        while (nums) {
            if (nums > 4) {
                ans += digits.substr(index, 3) + "-";
                index += 3;
                nums -= 3;
            } else {
                if (nums == 4) {
                    ans += digits.substr(index, 2) + "-" + digits.substr(index + 2, 2);
                } else {
                    //最后可能剩下两个，也可能剩下三个
                    ans += digits.substr(index, nums);
                }
                break;
            }
        }
        return ans;
    }
};
