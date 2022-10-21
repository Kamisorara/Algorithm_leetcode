class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();
        int[] magazineLetterArr = new int[26];
        int[] ransomNoteLetterArr = new int[26];
        for (int i = 0; i < ransomNoteChars.length; i++) {
            ransomNoteLetterArr[ransomNoteChars[i] - 'a']++;
        }
        for (int i = 0; i < magazineChars.length; i++) {
            magazineLetterArr[magazineChars[i] - 'a']++;
        }
        int ans = 0, n = ransomNote.length();
        for (int i = 0; i < 26; i++) {
            if (magazineLetterArr[i] >= ransomNoteLetterArr[i] && ransomNoteLetterArr[i] != 0) {
                ans += ransomNoteLetterArr[i];
            }
        }
        return ans == n;
    }
}