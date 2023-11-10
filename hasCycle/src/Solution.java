/*
 * 注：快慢指针，如果指向的节点相同，则有环，Solution2同样是使用快慢指针，但代码更简洁可读
 */
class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode low = head;
        ListNode fast = head.next;

        while (low.val != fast.val) {
            if (low.next != null && low != null) {
                low = low.next;
            } else {
                return false;
            }

            if (fast != null & fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }
        }

        return true;

    }
}