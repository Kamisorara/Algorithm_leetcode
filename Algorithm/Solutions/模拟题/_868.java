package 模拟题;

public class _868 {
    public int binaryGap(int n) {
        String binStr = Integer.toBinaryString(n);
        int lastOneIdx = n, max = 0;
        for (int i = 0; i < binStr.length(); i++) {
            if (binStr.charAt(i) == '1') {
                max = Math.max(max, i - lastOneIdx);
                lastOneIdx = i;
            }
        }
        return max;
    }
}
