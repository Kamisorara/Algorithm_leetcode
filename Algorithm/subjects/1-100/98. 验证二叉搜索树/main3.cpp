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
// 执行用时：
// 0 ms
// , 在所有 C++ 提交中击败了
// 100.00%
// 的用户
// 内存消耗：
// 21.1 MB
// , 在所有 C++ 提交中击败了
// 55.87%
// 的用户
class Solution {
    
private:
    long long pre = LONG_MIN;
public:
    bool isValidBST(TreeNode* root) {
        return helper(root);
    }

    bool helper(TreeNode* node) {
        if (!node) {
            return true;
        }
        bool l = helper(node->left);
        if (node->val <= pre) {
            return false;
        }
        pre = node->val;
        bool r = helper(node->right);
        return l && r;
    }
};