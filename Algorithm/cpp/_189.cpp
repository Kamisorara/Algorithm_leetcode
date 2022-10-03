#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    /**
     * 189. 轮转数组
     */
     //临时数组替换
    void rotate(vector<int> &nums, int k) {
        //使用临时数组
        int n = nums.size();
        int temp[n];
        for (int i = 0; i < n; i++) {
            temp[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            //将字符串进行轮转向后移动k个位置
            nums[(i + k) % n] = temp[i];
        }
    }
};
