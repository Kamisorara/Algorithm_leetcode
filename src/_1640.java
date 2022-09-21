import java.util.HashMap;
import java.util.Map;

public class _1640 {
    /**
     * 1640. 能否连接形成数组
     */
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int arrLength = arr.length, piecesLength = pieces.length;
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < piecesLength; i++) {
            index.put(pieces[i][0], i);
        }
        for (int i = 0; i < arrLength; i++) {
            if (!index.containsKey(arr[i])) {
                return false;
            }
            int num = index.get(arr[i]);
            int len = pieces[num].length;
            for (int j = 0; j < len; j++) {
                if (arr[i + j] != pieces[num][j]) {
                    return false;
                }
            }
            i = i + len;//将i进行跳转
        }
        return true;
    }
}
