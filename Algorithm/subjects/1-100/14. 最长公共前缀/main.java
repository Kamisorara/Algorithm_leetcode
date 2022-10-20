class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        //排序把最短的放在前面
        Arrays.sort(strs, (s1, s2) -> s1.length() - s2.length());
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char tmep = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != tmep) {
                    return ans;
                }
            }
            ans += tmep;
        }
        return ans;
    }
}