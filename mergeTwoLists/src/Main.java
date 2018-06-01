public class Main {
    public static void main(String[] args) {
        Solution handler = new Solution();
        ListNode l1 = new ListNode(4);
        l1 = insert(l1, 2);
        l1 = insert(l1, 1);

        ListNode l2 = new ListNode(4);
        l2 = insert(l2, 2);
        l2 = insert(l2, 1);

        ListNode tmp = handler.mergeTwoLists(l1, l2);

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
