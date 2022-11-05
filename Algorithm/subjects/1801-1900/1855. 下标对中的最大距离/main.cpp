class Solution {
public:
    int maxDistance(vector<int>& nums1, vector<int>& nums2) {
        int n1 = nums1.size(), n2 = nums2.size();
        int i = 0, j = 0;
        int maxVal = 0;
        for (j = 0; j < n2; j++) {
            while (i < n1 && nums1[i] > nums2[j]) {
                i++;
            }
            if (i < n1) {
                maxVal = max(maxVal, j - i);
            }
        }
        return maxVal;
    }
};