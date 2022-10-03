import java.util.ArrayList;
import java.util.List;

public class _1417 {
    /**
     * 1417. 重新格式化字符串
     */
    public String reformat(String s) {
        //定义两个List存letter 和 digit
        List<String> letter = new ArrayList<>();
        List<String> digit = new ArrayList<>();
        char[] s_chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s_chars[i] >= '0' && s_chars[i] <= '9') {
                digit.add(String.valueOf(s_chars[i]));
            } else {
                letter.add(String.valueOf(s_chars[i]));
            }
        }
        if (letter.size() == 0 && digit.size() == 0) {
            return "";
        } else if (Math.abs(letter.size() - digit.size()) >= 2) {
            return "";
        } else if (letter.size() == 1 && digit.size() == 0) {
            return letter.get(0);
        } else if (letter.size() == 0 && digit.size() == 1) {
            return digit.get(0);
        } else {
            StringBuilder sb = new StringBuilder();
            if (letter.size() == digit.size()) {
                for (int i = 0; i < digit.size(); i++) {
                    sb.append(letter.get(i));
                    sb.append(digit.get(i));
                }
            } else if (letter.size() > digit.size()) {
                for (int i = 0; i < digit.size(); i++) {
                    sb.append(letter.get(i));
                    sb.append(digit.get(i));
                }
                sb.append(letter.get(letter.size() - 1));
            } else {
                for (int i = 0; i < letter.size(); i++) {
                    sb.append(digit.get(i));
                    sb.append(letter.get(i));
                }
                sb.append(digit.get(digit.size() - 1));
            }
            return sb.toString();
        }
    }
}
