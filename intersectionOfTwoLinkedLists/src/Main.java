/*
 * Date:  2023.11.10
 * Url:   https://leetcode.cn/problems/intersection-of-two-linked-lists/
 * Title: 相交链表
 *
 */

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.getIntersectionNode2(generateA(), generateB()));
//        printListNodes(generateA());
    }

    public static void printListNodes(ListNode a) {
        if (a != null) {
            System.out.print(a.val);
        } else {
            return;
        }
        while (a.next != null) {
            System.out.print(",");
            System.out.print(a.next.val);
            a = a.next;
        }
    }

    public static ListNode generateA() {
        ListNode a = new ListNode(4);
        a.next = new ListNode(1);
        a.next.next = new ListNode(8);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(5);
        return a;
    }

    public static ListNode generateB() {
        ListNode a = new ListNode(5);
        a.next = new ListNode(6);
        a.next.next = new ListNode(1);
        a.next.next.next = new ListNode(8);
        a.next.next.next.next = new ListNode(4);
        a.next.next.next.next.next = new ListNode(5);
        return a;
    }
}