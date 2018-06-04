/*
 * Date:  2018.06.04
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/44/
 * Title: 合并两个有序链表
 *
 */

public class Main {
    public static void main(String[] args) {
        Solution handler = new Solution();
//        ListNode l1 = new ListNode(4);
//        l1 = insert(l1, 2);
//        l1 = insert(l1, 1);
        ListNode l1 = null;

        ListNode l2 = new ListNode(4);
        l2 = insert(l2, 3);
        l2 = insert(l2, 2);
        l2 = insert(l2, 1);

        ListNode tmp = new ListNode(0);
        tmp = handler.mergeTwoLists(l1, l2);

        while (tmp != null) {
            System.out.print(tmp.val + ",");
            tmp = tmp.next;
        }

    }

    public static ListNode insert(ListNode head, int x) {
        ListNode n = new ListNode(x);
        n.next = head;
        head = n;

        return head;
    }
}
