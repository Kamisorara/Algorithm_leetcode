import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class _965 {
    public boolean isUnivalTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void dfs(TreeNode node, List<Integer> list) {
        if (node != null) {
            list.add(node.val);
            dfs(node.left, list);
            dfs(node.right, list);
        }
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
