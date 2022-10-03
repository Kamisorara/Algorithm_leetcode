package dfs;

public class Offer_28 {
    public boolean isSymmetric(TreeNode root) {
        //二叉树的对称使用method 1 采用dfs
        return dfs(root, root);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        //终止条件
        if (left == null && right == null) {
            return true;

        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && dfs(left.left, right.right) && dfs(left.right, right.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
