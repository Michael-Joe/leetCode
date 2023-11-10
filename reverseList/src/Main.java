public class Main {
    public static void main(String[] args){
        ListNode lis=new ListNode(4);
        lis=insert(lis,3);
        lis=insert(lis,2);
        lis=insert(lis,1);

        Solution handler=new Solution();
        ListNode resList=handler.reverseList(lis);

        while(resList!=null){
            System.out.print(resList.val+"->");
            resList=resList.next;
        }
    }
    public static ListNode insert(ListNode head, int x) {
        ListNode n = new ListNode(x);
        n.next = head;
        head = n;

        return head;
    }
}
