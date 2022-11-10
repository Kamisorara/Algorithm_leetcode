/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* left;
    Node* right;
    Node* next;

    Node() : val(0), left(NULL), right(NULL), next(NULL) {}

    Node(int _val) : val(_val), left(NULL), right(NULL), next(NULL) {}

    Node(int _val, Node* _left, Node* _right, Node* _next)
        : val(_val), left(_left), right(_right), next(_next) {}
};
*/

class Solution {
public:
    Node* connect(Node* root) {
        queue<Node*> q;
        if (root != NULL) q.push(root);
        while (!q.empty()) {
            int currSize = q.size();
            Node* preNode;
            Node* node;
            for (int i = 0; i < currSize; i++) {
                if (i == 0) {
                    preNode = q.front(); q.pop();
                    node = preNode;
                } else {
                    node = q.front(); q.pop();
                    preNode->next = node;
                    preNode = preNode->next;
                }
                if (node->left) q.push(node->left);
                if (node->right) q.push(node->right);
            }
            preNode->next = NULL;
        }
        return root;
    }
};