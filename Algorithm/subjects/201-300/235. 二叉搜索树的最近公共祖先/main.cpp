/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:

    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        vector<TreeNode*> path_p = getPath(root, p);
        vector<TreeNode*> path_q = getPath(root, q);
        TreeNode* ancestor;
        for (int i = 0; i < path_p.size() && i < path_q.size(); i++) {
            if (path_p[i] == path_q[i]) {
                ancestor = path_p[i];
            } else {
                break;
            }
        }
        return ancestor;
    }

    vector<TreeNode*> getPath(TreeNode* root, TreeNode* target) {
        vector<TreeNode*> res;
        TreeNode* node = root;
        while (node != target) {
            res.push_back(node);
            if (target->val > node->val) {
                node = node->right;
            } else if (target->val < node->val) {
                node = node->left;
            }
        }
        // 走到目标节点再添加目标节点
        res.push_back(node);
        return res;
    }

};