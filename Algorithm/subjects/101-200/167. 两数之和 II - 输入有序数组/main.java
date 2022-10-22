class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 本题的数组是有序的
        int n = numbers.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return new int[]{1, 2};
    }


    // 双指针 时间复杂度 O(n) (正确的解法)
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int num = numbers[left] + numbers[right];
            if (num < target) {
                left++;
            } else if (num > target) {
                right--;
            } else {
                return new int[]{left + 1,right + 1};
            }
        }
        return new int[]{-1,-1};
    }
}