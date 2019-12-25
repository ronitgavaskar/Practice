public class RemoveKFromEnd {

    public ListNode returnWithoutKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        int length = 1;

        while(fast.next != null) {
            fast = fast.next;
            length++;

            if (length > k) {
                slow = slow.next;
            }
        }

        int start = 0;
        boolean removed = false;

        fast = head;
        int indextoBeRemoved = length - k;

        while (fast != null) {
            if ((start == indextoBeRemoved - 1) && !removed) { // if next index is indexToBeRemoved 
                removed = true;
                fast.next = fast.next.next;
            } else {
                if (start == indextoBeRemoved && !removed) {
                    return head.next;
                }
                fast = fast.next;
                start++;
            }
        }

        return head;
    }

    public void print(ListNode head) {
        if (head == null) {System.out.println("NULL NODE");}
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static void main(String args[]) {
        RemoveKFromEnd s = new RemoveKFromEnd();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        s.print(s.returnWithoutKthFromEnd(node1, 3));
        // s.returnWithoutKthFromEnd(node1, 3);
        // should print 1 -> 2 -> 4 -> 5

        node2.next = null;
        s.print(s.returnWithoutKthFromEnd(node1, 2));
        // s.returnWithoutKthFromEnd(node1, 2);
        // should print 2

        node1.next = null;
        s.print(s.returnWithoutKthFromEnd(node1, 1));
        // s.returnWithoutKthFromEnd(node1, 2);
        // should print []

        
        
        

    }
}