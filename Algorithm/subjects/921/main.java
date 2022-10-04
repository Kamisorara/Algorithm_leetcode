class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int score = 0, ans = 0;
        for (char ch : s.toCharArray()) {
            score += ch == '(' ? 1 : -1;
            if (score < 0) {
                score = 0;
                ans++;
            }
        }
        return ans + score;
    }
}