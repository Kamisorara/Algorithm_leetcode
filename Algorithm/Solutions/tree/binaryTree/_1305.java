package tree.binaryTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 1305. 两棵二叉搜索树中的所有元素
 */
public class _1305 {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();
        dfs(root1, tree1);
        dfs(root2, tree2);
        tree1.addAll(tree2);
        Collections.sort(tree1);
        return tree1;
    }

    void dfs(TreeNode node, List<Integer> tree) {
        if (node == null) {
            return;
        }
        dfs(node.left, tree);
        tree.add(node.val);
        dfs(node.right, tree);
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
