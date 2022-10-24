class Solution {
public:
// 调用函数
    int reverse(int x) {
        int ans = 0;
        string s = to_string(x);
        std::reverse(s.begin(), s.end());
        try {
            ans = stoi(s);
            if (x < 0) {
                ans = -ans;
            }
        } catch(exception ex) {
            return ans;
        }
        return ans;
    }
};