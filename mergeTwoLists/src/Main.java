public class Main {
    public static void main(String[] args){
        Solution handler=new Solution();
        InsertHead ad=new InsertHead();
        ListNode l1=new ListNode(4);
        ad.insertHead(l1,2);
        ad.insertHead(l1,1);

        ListNode tmp=l1;
        while(tmp.next!=null){
            System.out.print(tmp.val+",");
            tmp=tmp.next;
        }

    }
}
