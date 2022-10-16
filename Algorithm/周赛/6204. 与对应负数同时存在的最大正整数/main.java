class Solution {
    public int findMaxK(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            map.put(num, 1);
        }
        for (int num : nums) {
            if (map.containsKey(-num)) {
                list.add(num);
            }
        }
        if (list.size() > 1) {
            Collections.sort(list);
            return list.get(list.size() - 1);
        } else {
            return -1;
        }
    }
}