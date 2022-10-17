class Solution {
    public int totalFruit(int[] fruits) {
        // 区间内两个连续子数的最大值
        // 采用滑动窗口
        int maxVal = 0, n = fruits.length;
        int left = 0, right = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (right < n) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while (map.size() > 2) {
                //如果存在第三个数逐渐移动left 并移除fruit[left]
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxVal = Math.max(maxVal, right - left + 1);
            right++;
        }
        return maxVal;
    }
}