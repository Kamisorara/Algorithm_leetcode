/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // 迭代
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    // 递归
    public ListNode reverseList(ListNode head) {
        //头结点为空
        if (head == null) {
            return head;
        }
        //终止条件
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next); //一直递归到倒数第二个节点
        head.next.next = head;
        head.next = null;//尾结点指向空
        return newHead;
    }
}