class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list =null;
        ListNode temp=null;
        ListNode list1=l1;
        ListNode list2=l2;

        while(list1.next!=null||list2.next!=null){
            if(list1.next==null){
                list.next=list2.next;
                break;
            }
            if(list2.next==null){
                list.next=list1.next;
                break;
            }

            if(list1.val>list2.val){
                temp.val=list2.val;
                temp.next=list;
                list=temp;

                list2=list2.next;
            }else if(list1.val<list2.val){
                temp.val=list1.val;
                temp.next=list;
                list=temp;

                list1=list1.next;
            }else{
                temp.val=list1.val;
                temp.next=list;
                list=temp;
                temp.val=list2.val;
                temp.next=list;
                list=temp;

                list1=list1.next;
                list2=list2.next;
            }
        }
        return list;
    }
}