import java.util.Arrays;
import java.util.Map;
import java.util.Set;

class Solution {
    /**
     * 只出现一次的数字
     * 方法1 使用map映射
     */
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        //插入完成后对map进行遍历，找到只有对应1的值
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if (value == 1) {
                return key;
            }
        }
        return 0;
    }

    //方法2 先排序后查找
    public int singleNumber2(int[] nums) {
        Arrays.sort(int )
    }
}