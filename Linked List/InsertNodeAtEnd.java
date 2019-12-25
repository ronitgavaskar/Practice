public class InsertNodeAtEnd {


    public ListNode insertAtEnd(ListNode head, int value) {
        ListNode temp = head;
        boolean created = false;

        if (temp == null) {
            head = new ListNode(value);
        }

        while (temp != null) {
            if (temp.next == null && !created) {
                ListNode inserted = new ListNode(value);
                temp.next = inserted;
                created = true;
            }
            temp = temp.next;
        }
        return head;
    }

    public void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    } 
    public static void main(String args[]) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        InsertNodeAtEnd s = new InsertNodeAtEnd();
        s.print(s.insertAtEnd(node1, 4));
        System.out.println("==========");
        node1 = null;
        s.print(s.insertAtEnd(node1, 4));

    }
}