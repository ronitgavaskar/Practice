public class DeleteAlternateNodes {

    public ListNode deleteAlt(ListNode head) {
        if (head == null) return null;
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode temp = sentinel.next;

        while (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return sentinel.next;
    }

    public void print(ListNode head) {
        if (head == null) System.out.println("NULL NODE");
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }



    public static void main(String args[]) {
        DeleteAlternateNodes s = new DeleteAlternateNodes();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;

        s.print(s.deleteAlt(node1));
        // should print 1 -> 4

        node2.next = null;
        s.print(s.deleteAlt(node1));
        // shoudl print 1

        node1 = null;
        s.print(s.deleteAlt(node1));
        // should print NULL NODE
    }
}