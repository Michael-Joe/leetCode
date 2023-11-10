/*
 * 注：本题只给出了要删除的节点，并没有给出该链表头结点，因而无需遍历，只需要将要删除的节点值置为该节点下一个节点值即可
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}