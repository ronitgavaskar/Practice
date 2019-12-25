public class FindFreqLinkedList {

    public int getFrequency(ListNode head, int value) {
        if (head == null) return 0;

        int count = 0;
        while (head != null) {
            if (head.val == value) {
                count++;
            }
            head = head.next;
        }
        return count;
    }



    public static void main(String args[]) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        FindFreqLinkedList s = new FindFreqLinkedList();
        int count = s.getFrequency(node1, 1);
        System.out.println(count);

        node1.next = null;
        count = s.getFrequency(node1, 2);
        System.out.println(count);

        node1 = null;
        count = s.getFrequency(node1, 2);
        System.out.println(count);
    }
}