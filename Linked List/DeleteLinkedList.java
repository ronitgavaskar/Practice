public class DeleteLinkedList {

    public ListNode removeElements(ListNode head, ListNode node) {
        if (head == null) return null;

        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode slow = sentinel;

        while (slow.next != null) {
            if (slow.next == node) {
                slow.next = slow.next.next;
            } else {
                slow = slow.next;
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
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        DeleteLinkedList s = new DeleteLinkedList();
        s.print(s.removeElements(node1, node2));

        ListNode nullNode = null;
        s.print(s.removeElements(nullNode, node1));



        
    }
}