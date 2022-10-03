import java.util.List;

public class _1455 {
    /**
     * 1455. 检查单词是否为句中其他单词的前缀
     */

    public int isPrefixOfWord(String s, String t) {
        String[] ss = s.split(" ");
        int n = ss.length, m = t.length();
        for (int i = 0; i < n; i++) {
            if (ss[i].length() < m) continue;
            boolean ok = true;
            for (int j = 0; j < m && ok; j++) {
                if (ss[i].charAt(j) != t.charAt(j)) {
                    ok = false;
                    break;
                }
            }
            if (ok) return i + 1;
        }
        return -1;
    }
}
