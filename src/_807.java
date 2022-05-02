import java.util.ArrayList;
import java.util.List;

public class _807 {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        TreeNode dummyNode = new TreeNode(-1);
        TreeNode currNode = dummyNode;
        for (int value :
                list) {
            currNode.right = new TreeNode(value);
            currNode = currNode.right;
        }
        return dummyNode.right;
    }

    void helper(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
