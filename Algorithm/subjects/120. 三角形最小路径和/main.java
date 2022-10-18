class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left = 0, right = 0;
        List<Integer> list = new ArrayList<>();
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] > nums2[right]) {
                right++;
            } else if (nums1[left] < nums2[right]) {
                left++;
            } else {
                list.add(nums1[left]);
                left++;
                right++;
            }
        }
        int size = list.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}