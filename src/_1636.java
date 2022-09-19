import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class _1636 {
    /**
     * 1636. 按照频率将数组升序排序
     * 给你一个整数数组 nums ，请你将数组按照每个值的频率 升序 排序。如果有多个值的频率相同，请你按照数值本身将它们 降序 排序。
     * <p>
     * 请你返回排序后的数组。
     */
    //言外之意就是频率最小平且最大的排在前面
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        for (int num : nums) {
            if (hashTable.containsKey(num)) {
                hashTable.put(num, hashTable.get(num) + 1);
            } else {
                hashTable.put(num, 1);
            }
        }
        List<int[]> list = new ArrayList<>();
        for (int key : hashTable.keySet()) {
            list.add(new int[]{key, hashTable.get(key)});
        }
        Collections.sort(list, (a, b) -> {
            return a[1] != b[1] ? a[1] - b[1] : b[0] - a[0];
        });

        int[] ans = new int[nums.length];
        int index = 0;
        for (int[] arr : list) {
            int target = arr[0];
            int num = arr[1];
            while (num-- > 0) {
                ans[index++] = target;
            }
        }
        return ans;
    }
}
