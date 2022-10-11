class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            count1[s.charAt(i) - 'a']++;
            count2[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}