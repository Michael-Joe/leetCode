

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = null;
        ListNode temp = null;
        ListNode p = null;
        ListNode tail = null;
        ListNode list1 = l1;
        ListNode list2 = l2;

        while (list1 != null || list2 != null) {
            if (list1.next == null) {

                p = list;
                if (p == null) {
                    p=list2;
                } else {
                    while (p.next != null) {
                        p = p.next;
                    }
                    p.next = list2.next;
                }

                break;
            }

            if (list2.next == null) {

                p = list;
                if (p == null) {
                    p=list1;
                } else {
                    while (p.next != null) {
                        p = p.next;
                    }
                    p.next = list1.next;
                }

                break;
            }

            if (list1.val > list2.val) {
                p = list;
                if (p == null) {
                    temp.next = p;
                    p = temp;
                } else {
                    while (p.next != null) {
                        p = p.next;
                    }
                    p.next = temp;
                }

                list2 = list2.next;
            } else if (list1.val < list2.val) {
                temp = new ListNode(list1.val);
                p = list;
                if (p == null) {
                    temp.next = p;
                    p = temp;
                } else {
                    while (p.next != null) {
                        p = p.next;
                    }
                    p.next = temp;
                }

                list1 = list1.next;
            } else {
                temp = new ListNode(list1.val);
                p = list;
                if (p == null) {
                    temp.next = p;
                    p = temp;
                } else {
                    while (p.next != null) {
                        p = p.next;
                    }
                    p.next = temp;
                }

                temp = new ListNode(list2.val);
                p = list;
                if (p == null) {
                    temp.next = p;
                    p = temp;
                } else {
                    while (p.next != null) {
                        p = p.next;
                    }
                    p.next = temp;
                }

                list1 = list1.next;
                list2 = list2.next;
            }
        }
        return list;
    }
}