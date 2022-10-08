class Solution {
    /**
     * 870. 优势洗牌
     * 
     * @return
     */
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Integer[] indexArr1 = new Integer[n];
        Integer[] indexArr2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexArr1[i] = i;
            indexArr2[i] = i;
        }
        Arrays.sort(indexArr1, (i, j) -> nums1[i] - nums1[j]);
        Arrays.sort(indexArr2, (i, j) -> nums2[i] - nums2[j]);
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums1[indexArr1[i]] > nums2[indexArr2[left]]) {
                ans[indexArr2[left]] = nums1[indexArr1[i]];
                left++;
            } else {
                ans[indexArr2[right]] = nums1[indexArr1[i]];
                right--;
            }
        }
        return ans;
    }
}