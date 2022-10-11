class Solution {
    public int reverse(int x) {
        /**
         * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
         *
         * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
         *
         * 假设环境不允许存储 64 位整数（有符号或无符号）。
         *  
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode.cn/problems/reverse-integer
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        if (x == 0) {
            return 0;
        }
        try {
            if (x > 0) {
                String s = String.valueOf(x);
                char[] chars = s.toCharArray();
                char[] temp = new char[chars.length];
                String result = "";
                for (int i = 0, k = chars.length - 1; i < chars.length; i++) {
                    temp[i] = chars[k--];
                }
                return Integer.valueOf(String.valueOf(temp));
            } else {
                String s = String.valueOf(x);
                char[] chars = s.toCharArray();
                char[] temp = new char[chars.length - 1];
                String result = "";
                for (int i = 0, k = chars.length - 1; i < chars.length - 1; i++) {
                    temp[i] = chars[k--];
                }
                int ans = Integer.valueOf(String.valueOf(temp));
                return -ans;
            }
        } catch (NumberFormatException e) {
            return 0;
        }

    }
}