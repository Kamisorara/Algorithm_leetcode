class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ansList = new ArrayList<>();
        int left = 0, right = 0;
        int minLength = Math.min(nums1.length, nums2.length);
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] < nums2[right]) {
                left++;
            } else if (nums1[left] > nums2[right]) {
                right++;
            } else {
                ansList.add(nums1[left]);
                left++;
                right++;
            }
        }
        int ansNumLength = ansList.size();
        int[] ans = new int[ansNumLength];
        for (int i = 0; i < ansNumLength; i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}