/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0, head);
        ListNode cur = temp;
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        for (int i = 0; i < length - n; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = temp.next;
        return ans;
    }
}