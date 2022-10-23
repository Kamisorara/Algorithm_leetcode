class Solution {
    // 无脑暴力
    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        if (word1Length <= word2Length) {
            for (int i = 0; i < word1Chars.length; i++) {
                sb.append(word1Chars[i]);
                sb.append(word2Chars[i]);
            }
            for (int i = word1Length; i < word2Chars.length; i++) {
                sb.append(word2Chars[i]);            
            }
            return sb.toString();
        } else {
            for (int i = 0; i < word2Chars.length; i++) {
                sb.append(word1Chars[i]);
                sb.append(word2Chars[i]);
            }
            for (int i = word2Length; i < word1Chars.length; i++) {
                sb.append(word1Chars[i]);            
            }
            return sb.toString();
        }
    }
    // 双指针
    public String mergeAlternately(String word1, String word2) {
        int left = 0, right = 0;
        int n = word1.length(), m = word2.length();
        StringBuilder sb = new StringBuilder();
        while (left < n || right < m) {
            if (left < n) {
                sb.append(word1.charAt(left));
                left++;
            }
            if (right < m) {
                sb.append(word2.charAt(right));
                right++;
            }
        }
        return sb.toString();
    }
}