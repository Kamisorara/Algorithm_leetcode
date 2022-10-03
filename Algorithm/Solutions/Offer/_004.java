package Offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _004 {
    /**
     * 剑指 Offer II 004. 只出现一次的数字
     */
    //1.使用map无脑暴力
    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num :
                nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);

            } else {
                map.put(num, 1);
            }
        }

        int target = 0;
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                target = num;
            }
        }
        return target;
    }

}
