public class FindLengthSLL {

    public int getLength(ListNode head) {
        if (head == null) return 0;

        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }

        return len;
    }


    public static void main(String args[]) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        FindLengthSLL s = new FindLengthSLL();
        System.out.println(s.getLength(node1));
    }
}