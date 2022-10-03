/**
 * 944. 删列造序
 */
public class _944 {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        int row = strs.length;
        int col = strs[0].length();
        for (int j = 0; j < col; j++) {
            for (int i = 1; i < row; i++) {
                if (strs[i - 1].charAt(j) > strs[i].charAt(j)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
