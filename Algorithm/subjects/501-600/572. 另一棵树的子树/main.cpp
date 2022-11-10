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
private:

    bool check(TreeNode *o, TreeNode *t) {
        // 如果都为空
        if (!o && !t) {
            return true;
        }
        // 如果其中一个为空或是不相等就返回false 
        if ((!o && t) || (o && !t) || (o->val != t->val)) {
            return false;
        }
        return check(o->left, t->left) && check(o->right, t->right);
    }

    bool dfs(TreeNode* o, TreeNode* t) {
        if (!o) {
            return false;
        }
        return check(o, t) || dfs(o->left, t) || dfs(o->right, t);
    }
public:
    bool isSubtree(TreeNode* s, TreeNode* t) {
        return dfs(s, t);
    }
};