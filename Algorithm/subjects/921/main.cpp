#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    /**
     * 921. 使括号有效的最少添加
     */
    int minAddToMakeValid(string s) {
        int n = s.size();
        int score = 0, ans = 0;
        for (char ch: s) {
            score += ch == '(' ? 1 : -1;
            if (score < 0) {
                score = 0;
                ans++;
            }
        }
        return ans + score;

    }
};
