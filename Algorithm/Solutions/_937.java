import java.util.ArrayList;
import java.util.List;


public class _937 {
    /**
     * 错误案例
     */
    public String[] reorderLogFiles(String[] logs) {
        int length = logs.length;
        List<String> digital = new ArrayList<>();
        List<String> letter = new ArrayList<>();
        for (String str_sub : logs) {
            String[] chars = str_sub.split(" ");
            boolean isLetter = true;
            for (String sub : chars) {
                char[] chars1 = sub.toCharArray();
                if (chars1[0] >= '0' && chars1[0] <= '9') {
                    digital.add(str_sub);
                    isLetter = false;
                    break;
                }
            }
            if (isLetter) {
                letter.add(str_sub);
            }
        }
        String[] result = new String[length];
        letter.addAll(digital);
        for (int i = 0; i < length; i++) {
            result[i] = letter.get(i);
        }
        return result;
    }

    /**
     * 正确案例
     */
    class Log {
        int type, idx;
        String ori, sign, content;

        Log(String s, int _idx) {
            idx = _idx;
            int n = s.length(), i = 0;
            while (i < n && s.charAt(i) != ' ') i++;
            sign = s.substring(0, i);
            content = s.substring(i + 1);
            ori = s;
            type = Character.isDigit(content.charAt(0)) ? 1 : 0;
        }
    }

    public String[] reorderLogFiles(String[] logs) {
        int n = logs.length;
        List<Log> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(new Log(logs[i], i));
        Collections.sort(list, (a, b) -> {
            if (a.type != b.type) return a.type - b.type;
            if (a.type == 1) return a.idx - b.idx;
            return !a.content.equals(b.content) ? a.content.compareTo(b.content) : a.sign.compareTo(b.sign);
        });
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) ans[i] = list.get(i).ori;
        return ans;
    }
}
