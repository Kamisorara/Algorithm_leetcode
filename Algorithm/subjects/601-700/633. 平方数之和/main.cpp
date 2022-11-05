typedef long long LL;

class Solution {
public:
    bool judgeSquareSum(int c) {
        for (LL a = 0; pow(a, 2) <= c; a++) {
            double b = sqrt(c - pow(a, 2));
            // 保证b 是一个整数
            if (b == int(b)) {
                return true;
            }
        }
        return false;
    }
};