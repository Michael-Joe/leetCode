public class Solution {
    // 第一种做法，分别计算长度
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode headAA = headA;
        ListNode headBB = headB;
        int aLength = 0;
        int bLength = 0;
        while (headAA != null) {
            aLength++;
            headAA = headAA.next;
        }
        while (headBB != null) {
            bLength++;
            headBB = headBB.next;
        }
        if (aLength >= bLength) {
            for (int i = 0; i < aLength - bLength; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < bLength - aLength; i++) {
                headB = headB.next;
            }
        }
        while (headA != null) {
            if (headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    // 第二种做法，遍历，a尾指b头
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        // 实际上这里是利用了a+b和b+a之后一定会同时尾null跳出循环
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}