/*
 * Date:  2018.06.04
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/46/
 * Title: 环形链表
 *
 */

public class Main {
    public static void main(String[] args){
        Solution handler=new Solution();
        ListNode l1=new ListNode(1);

        System.out.println(handler.hasCycle(l1));

    }

    public static ListNode insert(ListNode head, int x) {
        ListNode n = new ListNode(x);
        n.next = head;
        head = n;

        return head;
    }
}
