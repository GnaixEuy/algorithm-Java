package 算法入门.第八天;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/28
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 填充每个节点的下一个右侧节点指针 {
    /**
     * Definition for a Node.
     * class Node {
     * public int val;
     * public Node left;
     * public Node right;
     * public Node next;
     * <p>
     * public Node() {}
     * <p>
     * public Node(int _val) {
     * val = _val;
     * }
     * <p>
     * public Node(int _val, Node _left, Node _right, Node _next) {
     * val = _val;
     * left = _left;
     * right = _right;
     * next = _next;
     * }
     * };
     */
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    class Solution {
        public Node connect(Node root) {
            if (root == null) {
                return null;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node node = queue.poll();
                    if (i < size - 1) {
                        node.next = queue.peek();
                    }
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            return root;
        }
    }
}
