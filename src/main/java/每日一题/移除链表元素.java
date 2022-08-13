package 每日一题;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/8/13
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 移除链表元素 {
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
    public class ListNode {
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
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) {
                return null;
            }
            ListNode tmp1, tmp2;
            tmp1 = head;
            tmp2 = head.next;
            while (tmp2 != null) {
                if (tmp2.val == val) {
                    tmp1.next = tmp2.next;
                } else {
                    tmp1 = tmp2;
                }
                if (tmp1.next != null) {
                    tmp2 = tmp1.next;
                } else {
                    break;
                }
            }
            if (head.val == val && head.next == null) {
                return null;
            } else if (head.val == val) {
                return head.next;
            }
            return head;
        }
    }
}
