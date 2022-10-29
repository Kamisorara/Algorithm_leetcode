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
    bool isLeftNode(TreeNode* node) {
        return !node->left && !node->right;
    }

    int sumOfLeftLeaves(TreeNode* root) {
        // BFS
        if (!root) {
            return 0;
        }
        int ans = 0;
        queue<TreeNode*> q;
        q.push(root);
        while (!q.empty()) {
            int size = q.size();
            TreeNode* node = q.front();
            q.pop();
            if (node->left) {
                if (isLeftNode(node->left)) {
                    ans += node->left->val;
                } else {
                    q.push(node->left);   
                }
            }
            if (node->right) {
                if (!isLeftNode(node->right)) {
                    q.push(node->right);
                }
            }   
        }
        return ans;
    }
};