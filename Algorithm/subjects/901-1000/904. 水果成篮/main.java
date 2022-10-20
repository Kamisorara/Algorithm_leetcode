class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        //最后一定要留出两个数的空位
        for (int k = 0; k < nums.length - 2; k++) {
            //因为这个数组升序了，如果nums[k] > 0 则说明没有复数了可以break掉
            if (nums[k] > 0) {
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;  // 给数组去重
            }
            //定义左右指针
            int left = k + 1, right = nums.length - 1;
            while (left < right) {
                int num = nums[k] + nums[left] + nums[right];
                //如果现在的 num 太大了 则说明 当前的 right 太大了
                if (num > 0) {
                    //移动right 并去重
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    right--;
                    // 如果现在的num 太大了则说明当前的 left 太小了 
                } else if (num < 0) {
                    //移动left 并去重
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    left++;
                    //此时正好等于 0 了
                } else {
                    //添加至res中
                    res.add(new ArrayList<>(Arrays.asList(nums[k], nums[left], nums[right])));
                    //移动left 和 right 并去重
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}