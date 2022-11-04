class Solution {
public:
    int specialArray(vector<int>& nums) {
        int n = nums.size();
        int target = 0;
        for (int i = 1; i <= n; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] >= i) {
                    temp++;
                }
            }
            if (temp == i) {
                return temp;
            } 
        }
        return -1;
    }
};