package 每日一题;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/8/13
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 二叉树的层序遍历 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
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

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            LinkedList<List<Integer>> lists = new LinkedList<>();
            if (root == null) {
                return lists;
            }
            Queue<TreeNode> integers = new ArrayDeque<>();
            integers.offer(root);
            while (!integers.isEmpty()) {
                LinkedList<Integer> treeNodes = new LinkedList<>();
                int size = integers.size();
                for (int i = 0; i < size; i++) {
                    TreeNode poll = integers.poll();
                    assert poll != null;
                    treeNodes.add(poll.val);
                    if (poll.left != null) {
                        integers.offer(poll.left);
                    }
                    if (poll.right != null) {
                        integers.offer(poll.right);
                    }
                }
                lists.add(treeNodes);
            }
            return lists;
        }
    }
}
