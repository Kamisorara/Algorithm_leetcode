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
    //BFS
    int maxDepth(TreeNode* root) {
        int res = 0;
        queue<TreeNode*> q;
        if (root == nullptr) {
            return res;
        }
        q.push(root);
        while (!q.empty()) {
            int currSize = q.size();
            res++;
            for (int i = 0; i <currSize; i++) {
                TreeNode* node = q.front(); q.pop();
                if (node->left != nullptr) {
                    q.push(node->left);
                }
                if (node->right != nullptr) {
                    q.push(node->right);
                }
            }
        }
        return res;
    }

    // DSF
    // 递归计算左右子树的最大深度
    int maxDepth(TreeNode* root) {
        if (root == nullptr) {
            return 0;
        } else {
            // 先走左子树 直到左子树为空走右子树
            int left = maxDepth(root->left);
            int right = maxDepth(root->right);
            return max(left, right) + 1;
        }
    }
};