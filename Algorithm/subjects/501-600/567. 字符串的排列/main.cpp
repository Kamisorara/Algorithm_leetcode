class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        // 使用滑动窗口
        // arr1 固定 arr2 动态添加
        vector<int> arr1(26), arr2(26);
        int m = s1.size(), n = s2.size();
        if (m > n) {
            return false;
        }
        for (int i = 0; i < m; i++) {
            arr1[s1[i] - 'a']++;
            arr2[s2[i] - 'a']++;
        }
        if (arr1 == arr2) {
            return true;
        }
        // 对 arr2 动态添加 长度始终是 m 也就是 s1 的 长度
        for (int i = m; i < n; i++) {
            arr2[s2[i] - 'a']++;
            arr2[s2[i - m] - 'a']--;
            if (arr1 == arr2) {
                return true;
            }
        }
        return false;
    }
};