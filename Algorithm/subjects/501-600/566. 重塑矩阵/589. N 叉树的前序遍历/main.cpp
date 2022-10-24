/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<int> preorder(Node* root) {
        vector<int> nums;
        helper(root, nums);
        return nums;
    }

    void helper(Node* node, vector<int>& nums) {
        if (!node) {
            return;
        }
        nums.push_back(node->val);
        for (Node* child : node->children) {
            helper(child, nums);
        }
    }
};