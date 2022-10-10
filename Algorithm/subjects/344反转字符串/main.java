class Solution {
    public void reverseString(char[] s) {
        char[] temp = new char[s.length];
        for (int i = 0, k = s.length - 1; i < s.length; i++) {
            temp[i] = s[k];
            k--;
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = temp[i];
        }
    }
}