/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode* node = new ListNode(0);
        node->next = head;
        ListNode* temp = node;
        while (temp->next && temp->next->next) {
            ListNode* start = temp->next;
            ListNode* end = temp->next->next;
            temp->next = end;
            start->next = end->next;
            end->next = start;
            temp = start;
        }
        return node->next;
    }
};