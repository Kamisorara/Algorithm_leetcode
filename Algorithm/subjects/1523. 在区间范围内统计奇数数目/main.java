class Solution {
    public int countOdds(int low, int high) {
        // low = 3 high = 7
        // 如果说 0 一个数之间有多少数 可以表示成 (num + 1) / 2
        // 那么换成 low - high 之间
        // 会出现一个问题要知道 low是偶数还是奇数 如果 low 是 偶数那么结果就是 (high + 1) - low / 2
        if (low % 2 != 0 || high % 2 != 0) {
            int num = high - low;
            return num / 2 + 1;
        } else {
            int num = (high + 1) - low;
            return num / 2;
        }
    }
}