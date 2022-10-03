#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    /**
     * 1784. 检查二进制字符串字段
     * 一个或多个1是一个连续字段，比如1、1111。如果字符串s含有的连续字段数目≤1，则返回true，否则为false。
     */
    bool checkOnesSegment(string s) {
        return s.find("01") == string::npos;
    }
};
