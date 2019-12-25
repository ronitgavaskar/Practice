// This solution will delete kth element from the beginning

public class RemoveKthElement {


    public ListNode kthList(ListNode head, int k) {
        if (head == null) return null;

        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode temp = sentinel;

        int i = 0;
        boolean removed = false;
        while (temp.next != null) {
            if (i == k - 1 && !removed) {
                temp.next = temp.next.next;
                removed = true;
            } else {
                i++;
                temp = temp.next;
            }
        }
        return sentinel.next;
    }

    public void print(ListNode node) {
        if (node == null) {
            System.out.println("WE HAVE A NULL NODE INPUT");
        }
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
    public static void main(String args[]) {

        RemoveKthElement s = new RemoveKthElement();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        s.print(s.kthList(node1, 2));
    }
}