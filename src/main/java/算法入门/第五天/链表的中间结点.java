package 算法入门.第五天;

import java.util.LinkedList;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/25
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 链表的中间结点 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        //linkList Size方法 0  1 坑
        public ListNode middleNode(ListNode head) {
            if (head.next == null) {
                return head;
            }
            if (head.next.next == null) {
                return head.next;
            }
            LinkedList<ListNode> listNodes = new LinkedList<>();
            while (head.next != null) {
                listNodes.add(head);
                head = head.next;
            }
            int index = listNodes.size() + 1 >> 1;
            return listNodes.get(index);
        }
    }

    /**
     * 最优解 快慢指针法 跨越思维
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}