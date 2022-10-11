class Solution {
    public int firstUniqChar(String s) {
        //两次遍历
        //统计字符出现次数
        int[] charArr = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            charArr[chars[i] - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charArr[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}