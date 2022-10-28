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
    bool findTarget(TreeNode* root, int k) {
        vector<int> nums;
        helper(root, nums);
        int n = nums.size();
        int left = 0, right = n - 1;
        while (left < right) {
            if (nums[left] + nums[right] < k) {
                left++;
            } else if (nums[left] + nums[right] > k) {
                right--;
            } else if (nums[left] + nums[right] == k){
                return true;
            }
        }
        return false;
    }

    void helper (TreeNode* node, vector<int>& nums) {
        if (!node) {
            return;
        }
        helper(node->left, nums);
        nums.push_back(node->val);
        helper(node->right, nums);
    }
};