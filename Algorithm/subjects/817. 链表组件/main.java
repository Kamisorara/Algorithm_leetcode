class Solution {
    public int numComponents(ListNode head, int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        while (head != null) {
            if (set.contains(head.val)) {
                while (head != null && set.contains(head.val)) head = head.next;
                ans++;
            } else {
                head = head.next;
            }
        }
        return ans;
    }
}