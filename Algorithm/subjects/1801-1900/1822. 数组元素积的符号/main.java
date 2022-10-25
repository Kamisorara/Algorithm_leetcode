class Solution {
    public int arraySign(int[] nums) {
        boolean status = false;
        int positiveNum = 0, negativeNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] > 0) {
                positiveNum++;
            } else if (nums[i] < 0) {
                negativeNum++;
            }
        }
        if (negativeNum % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}