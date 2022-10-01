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
        string numberList;
        for (int i = 0; i < n; i++) {
            char temp = number[i];
            if (isdigit(temp)) {
                numberList.push_back(temp);
            }
        }
        int nums = numberList.size();
        int index = 0;
        while (nums > 0) {
            if (nums > 4) {
                ans += numberList.substr(index, 3) + "-";
                index += 3;
                nums -= 3;
            } else {
                if (nums == 4) {
                    ans += numberList.substr(index, 2) + "-" + numberList.substr(index + 2, 2);
                } else {
                    ans += numberList.substr(index, 2);
                }
            }
            break;
        }
        return ans;
    }
};
