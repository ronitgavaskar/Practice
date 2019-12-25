public class ContainsLoop {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node2;

        ContainsLoop s = new ContainsLoop();
        System.out.println(s.hasCycle(node1));
        // Should be true

        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        System.out.println(s.hasCycle(node1));
        // Should be false

        node1.next = null;
        System.out.println(s.hasCycle(node1));
        // Should be false

        node1 = null;
        System.out.println(s.hasCycle(node1));
        // Should be false

        node1 = new ListNode(1);
        node1.next = node2;
        node2.next = node1;
        System.out.println(s.hasCycle(node1));
        // Should be true
    }
}