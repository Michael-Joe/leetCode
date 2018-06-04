/*
 * 注：比较节点，尾插法；
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode list = null;

        while (list1 != null || list2 != null) {
            if (list1 == null && list2 != null) {
                if (list != null) {
                    ListNode tmp = list;
                    while (tmp.next != null) {
                        tmp = tmp.next;
                    }
                    tmp.next = list2;
                } else {
                    list = list2;
                }
                return list;
            } else if (list1 != null && list2 == null) {
                if (list != null) {
                    ListNode tmp = list;
                    while (tmp.next != null) {
                        tmp = tmp.next;
                    }
                    tmp.next = list1;
                } else {
                    list = list1;
                }
                return list;
            } else if (list1 == null && list2 == null) {
                return list;
            } else {
                if (list1.val > list2.val) {
                    list = tailInsert(list, list2);
                    list2 = list2.next;
                } else if (list1.val < list2.val) {
                    list = tailInsert(list, list1);
                    list1 = list1.next;
                } else {
                    list = tailInsert(list, list1);
                    list1 = list1.next;
                    list = tailInsert(list, list2);
                    list2 = list2.next;
                }
            }
        }

        return list;
    }

    public ListNode tailInsert(ListNode list, ListNode data) {
        ListNode tmp = list;
        ListNode node = new ListNode(0);

        node.next = null;
        node.val = data.val;

        if (list == null) {
            list = node;
            return list;
        }

        while (tmp.next != null) {
            tmp = tmp.next;
        }
        node.next = tmp.next;
        tmp.next = node;

        return list;
    }
}