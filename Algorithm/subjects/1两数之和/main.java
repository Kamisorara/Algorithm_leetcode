class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashTable.containsKey(target - nums[i])) {
                return new int[]{hashTable.get(target - nums[i]), i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[]{0};
    }
}