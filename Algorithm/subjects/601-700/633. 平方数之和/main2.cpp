typedef long long LL;

class Solution {
public:
    bool judgeSquareSum(int c) {
        LL left = 0, right = (int)sqrt(c);
        while (left <= right) {
            LL sum = pow(left, 2) + pow(right, 2);
            if (sum == c) {
                return true;
            } else if (sum > c) {
                right--;
            } else if (sum < c) {
                left++;
            }
        }
        return false;
    }
};