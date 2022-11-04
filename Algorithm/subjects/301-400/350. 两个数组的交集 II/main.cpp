class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        vector<int> result;
        int n1 = nums1.size(), n2 = nums2.size();
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        int leftPoint = 0, rightPoint = 0;
        while (leftPoint < n1 && rightPoint < n2) {
            if (nums1[leftPoint] < nums2[rightPoint]) {
                leftPoint++;
            } else if (nums1[leftPoint] > nums2[rightPoint]) {
                rightPoint++;
            } else {
                result.push_back(nums1[leftPoint]);
                leftPoint++;
                rightPoint++;
            }
        }
        return result;
    }
};