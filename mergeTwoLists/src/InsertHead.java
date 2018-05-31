class InsertHead {
    public void insertHead(ListNode list,int x){
        ListNode tmp=new ListNode(x);
        tmp.next=list;
        list=tmp;

    }
}
