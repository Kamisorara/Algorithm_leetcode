class Solution {
public:
// 使用数学
    int reverse(int x) {
        int res = 0;
        while (x != 0) {
            // 如果这一步要大了，那么下一步马上就是 *10 马上就会溢出了
            if (res < INT_MIN / 10 || res > INT_MAX / 10) {
                return 0;
            }
            // 取个位
            int digit = x % 10;
            x /= 10;
            res = res * 10 + digit; 
        }
        return res;
    }
};