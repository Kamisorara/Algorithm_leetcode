package dynamic_programming;

public class _5_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        //字符串的长度
        int len = s.length();
        //长度为1的字符串肯定是回文子串直接return
        if (len < 2) {
            return s;
        }
        //初始化最长的串
        int maxLen = 1;
        int begin = 0;

        //使用boolean数组来记录回文子串的状态
        boolean[][] dp = new boolean[len][len];


        char[] charArray = s.toCharArray();
        //初始化，子串长度为1的子串都是true
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        //开始枚举
        //开始递推 最好的情况是子串的长度等于父串
        for (int L = 2; L <= len; L++) {
            //定义左边界,左边界的定义可以宽松一点
            for (int i = 0; i < len; i++) {
                //定义右边界 L =  j-i=1得出
                int j = L + i - 1;
                //如果右边界越界直接break
                if (j >= len) {
                    break;
                }
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    //注意考虑两种情况
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                //只要dp[i][L] ==true 则表示这是一个回文子串,记录此时的位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }

            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
