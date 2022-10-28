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
    int getDecimalValue(ListNode* head) {
        vector<int> nums;
        int res = 0;
        while (head) {
            nums.push_back(head->val);
            head = head->next;
        }
        int n  = nums.size();
        for (int i = nums.size() - 1, k = 0; i >= 0; i--) {
            res += (nums[i] * pow(2, k));
            k++;
        }
        return res;
    }
};