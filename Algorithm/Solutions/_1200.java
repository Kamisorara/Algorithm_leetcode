import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int length = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < length - 1; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            temp.add(arr[i + 1]);
            result.add(temp);
        }
        return result;
    }
}
