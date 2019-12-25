public class DeleteNode {


    public void deleteNode(ListNode node) {
        node.val = node.next.val; // replace with next value
        node.next = node.next.next; // change links
    }

}