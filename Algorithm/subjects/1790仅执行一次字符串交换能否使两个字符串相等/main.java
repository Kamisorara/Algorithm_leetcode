class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        //最多交换一次意味着两个字符串之间只有两个位置不相同
        //比如 s1 ,s2 分别在 i，j两处位置不同
        //则一定满足 s1[i] == s2[j] && s2[i] = s1[j]
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diff.size() >= 2) {
                    return false;
                }
                diff.add(i);
            }
        }
        if (diff.isEmpty()) {
            return true;
        }
        //两组字符串之间可能存在只有一个单词不同
        if (diff.size() != 2) {
            return false;
        }
        return s1.charAt(diff.get(0)) == s2.charAt(diff.get(1)) && s1.charAt(diff.get(1)) == s2.charAt(diff.get(0));
    }
}