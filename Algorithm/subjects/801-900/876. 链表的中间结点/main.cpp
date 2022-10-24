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
    ListNode* middleNode(ListNode* head) {
        vector<int> nums;
        ListNode* curr = head;
        ListNode* cur = head;
        while (curr != nullptr) {
            nums.push_back(curr -> val);
            curr = curr -> next;
        }
        int k = 0;
        while (k < nums.size() / 2) {
            cur = cur -> next;
            k++;
        }
        return cur;
        
    }
};