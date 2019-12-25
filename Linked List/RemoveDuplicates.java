import java.util.HashSet;

public class RemoveDuplicates {

    public ListNode removeDups(ListNode head) {
        if (head == null) return null;
        
        HashSet<Integer> set = new HashSet<>();

        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode temp = sentinel;

        while (temp.next != null) {
            if (set.contains(temp.next.val)) {
                temp.next = temp.next.next;
            } else {
                set.add(temp.next.val);
                temp = temp.next;
            }
        }
        return sentinel.next;
    }

    public void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String args[]) {
        ListNode node1 = new ListNode(22);
        ListNode node2 = new ListNode(21);
        ListNode node3 = new ListNode(22);
        ListNode node4 = new ListNode(31);
        ListNode node5 = new ListNode(41);
        ListNode node6 = new ListNode(23);
        ListNode node7 = new ListNode(21);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        RemoveDuplicates s = new RemoveDuplicates();
        s.print(s.removeDups(node1));

        // 22 -> 21 -> 22 -> 31 -> 41 -> 23 -> 21
        // return: 22 -> 31 -> 31 -> 41 -> 23

        
    }
}