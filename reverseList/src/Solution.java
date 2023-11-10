class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p,q,pr;
        p=head;
        q=null;

        while(p!=null){
            pr=p;
            p=p.next;
            pr.next=q;
            q=pr;
        }
        head=q;
        return head;

    }
}