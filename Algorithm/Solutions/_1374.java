import java.util.List;

public class _1374 {
    /**
     * 1374. 生成每种字符都是奇数个的字符串
     */
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0 && --n >= 0) sb.append('a');
        while (n-- > 0) sb.append('b');
        return sb.toString();
    }

}
