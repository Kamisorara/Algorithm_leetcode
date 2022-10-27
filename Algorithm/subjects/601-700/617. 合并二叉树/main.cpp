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
    TreeNode* mergeTrees(TreeNode* root1, TreeNode* root2) {
        // 默认返回第一棵树
        if (root1 == nullptr && root2 == nullptr) {
            return nullptr;
        }
        if (root1 == nullptr) {
            return root2;
        }
        if (root2 == nullptr) {
            return root1;
        }
        queue<TreeNode*> q;
        q.push(root1);
        q.push(root2);
        while (!q.empty()) {
            TreeNode* leftNode = q.front(); q.pop();
            TreeNode* rightNode = q.front(); q.pop();
            leftNode->val = leftNode->val + rightNode->val;
            if (leftNode->left != nullptr && rightNode->left != nullptr) {
                q.push(leftNode->left);
                q.push(rightNode->left);
            } else if (leftNode->left == nullptr) {
                leftNode->left = rightNode-> left;
            }
            if (leftNode->right != nullptr && rightNode->right != nullptr) {
                q.push(leftNode->right);
                q.push(rightNode->right);
            } else if (leftNode->right == nullptr) {
                leftNode->right = rightNode->right;
            } 
        }   
        return root1;
    }
};