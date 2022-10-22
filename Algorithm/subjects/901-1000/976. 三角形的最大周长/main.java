import java.util.*;

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // int a = nums[nums.length - 1];
        // int b = nums[nums.length - 2];
        // int c = nums[nums.length - 3];
        // if (a + b <=c || a + c <= b || b + c <= a) {
        // return 0;
        // } else {
        // return a + b + c;
        // }

        for (int i = n - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
            if (a + b <= c || a + c <= b || b + c <= a) {
                if (i > 2) {
                    c = nums[i - 3];
                }
            } else {
                return a + b + c;
            }
        }
        return 0;
    }
}
