class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        String temp = "";
        for (int i = 0; i < n; i++) {
            if (Character.isLetterOrDigit(chars[i])) {
                temp += chars[i];
            }
        }
        //转小写
        String ans = temp.toLowerCase();
        int left = 0, right = temp.length() - 1;
        while (left < right) {
            if (ans.charAt(left) != ans.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}