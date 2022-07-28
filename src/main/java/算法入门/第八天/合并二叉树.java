package 算法入门.第八天;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/28
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 合并二叉树 {
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
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 == null) {
                return null;
            } else if (root1 == null) {
                return root2;
            } else if (root2 == null) {
                return root1;
            }
            root1.val += root2.val;
            if (root1.left != null && root2.left != null) {
                mergeTrees(root1.left, root2.left);
            } else if (root1.left == null && root2.left != null) {
                root1.left = root2.left;
            }
            if (root1.right != null && root2.right != null) {
                mergeTrees(root1.right, root2.right);
            } else if (root1.right == null && root2.right != null) {
                root1.right = root2.right;
            }
            return root1;
        }
    }
}
