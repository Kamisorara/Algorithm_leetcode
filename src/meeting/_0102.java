package meeting;

public class _0102 {
    /**
     * 面试题 01.02. 判定是否互为字符重排
     */
    public boolean CheckPermutation(String s1, String s2) {
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for (char e : s1.toCharArray()) {
            s1Arr[e - 'a']++;
        }
        for (char e : s2.toCharArray()) {
            s2Arr[e - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (s1Arr[i] != s2Arr[i]) {
                return false;
            }
        }
        return true;
    }

}
