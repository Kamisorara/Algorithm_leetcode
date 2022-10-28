/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isValidBST(TreeNode* root) {
        vector<long long> nums;
        helper(root, nums);
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums[i + 1] <= nums[i]) {
                return false;
            }
        }
        return true;

    }

    void helper(TreeNode* node, vector<long long>& nums) {
        if (!node) {
            return;
        }
        helper(node->left, nums);
        nums.push_back(node->val);
        helper(node->right,nums);
    }
};