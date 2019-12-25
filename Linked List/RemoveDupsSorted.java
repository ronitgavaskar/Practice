public class RemoveDupsSorted {

    public ListNode removeSortedDups(ListNode head) {
        if (head == null) return null;

        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode curr = sentinel;

        int value = curr.val;
        while (curr.next != null) {
            if (value == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                value = curr.next.val;
                curr = curr.next;
            }
        }
        return sentinel.next;
    }

    public void print(ListNode node) {
        if (node == null) System.out.println("NULL NODE LEFT...");
        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println("======");
    }

    public static void main(String args[]) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        RemoveDupsSorted s = new RemoveDupsSorted();
        s.print(s.removeSortedDups(node1));
        // should return 1 -> 3 -> 4 -> 5

        node2 = new ListNode(1);
        node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        s.print(s.removeSortedDups(node1));
        // should return 1 -> 2

        ListNode nullNode = null;
        s.print(s.removeSortedDups(nullNode));
        // should return null

        ListNode singleNode = new ListNode(1);
        singleNode.next = new ListNode(1);
        s.print(s.removeSortedDups(singleNode));
        // should return 1
    }
}