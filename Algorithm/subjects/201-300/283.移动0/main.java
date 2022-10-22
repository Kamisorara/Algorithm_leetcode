class Solution {
    // 先位移后 置零
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return;
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < n) {
            nums[index] = 0;
            index++;
        }
    }

    // 使用辅助 List集合(时间复杂度很高)
    public void moveZeroes(int[] nums) {
        int[] res = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < list.size()) {
                nums[i] = list.get(i);
            } else {
                nums[i] = 0;
            }
        }
    }

    // 使用双指针 (速度很快)
    class Solution {
        public void moveZeroes(int[] nums) {
            int left = 0, right = 0;
            while (right < nums.length) {
                if (nums[right] != 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                }
                right++;
            }
        }
    }
}