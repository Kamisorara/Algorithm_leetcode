package bfs;

import java.util.*;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 */
public class Offer_32_2 {
    /**
     * 本题从空间的角度来思考，不做哈希映射
     * 通过修改bfs来进行，使用队列来进行求解
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        //初步思路使用bfs和queue来解题
        //根据题目给出的范围当头节点为空时
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        //把根节点添加进去
        queue.offer(root);
        //循环的前提条件是queue不为空 ,通过维护队列来进行一次层级打印
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int currentSize = queue.size();
            //为了还原树的层级结构自循环从1开始
            for (int i = 1; i <= currentSize; i++) {
                TreeNode node = queue.poll();//弹出队首的元素，从而实现每层从左到右打印
                temp.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(temp);
        }
        return result;
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
