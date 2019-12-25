/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class FindMiddleElement {
    public ListNode middleNode(ListNode head) {
        
        // Two pointers: fast and slow
        // to find middle, fast needs to skip every node (next node is null)

        
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.val);
        return slow;
    }

    public static void main(String args[]) {

        //1 -> 2 -> 3 -> 1
        // Fast: 1; Head = 1
        // Fast: 3; Head = 2

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(1);
        FindMiddleElement s = new FindMiddleElement();
        s.middleNode(list1);
        // Should be 3

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        s.middleNode(list2);
        // Should be 2

        ListNode list3 = new ListNode(3);
        s.middleNode(list3);
        // Should be 3

        ListNode list4 = new ListNode(1);
        list4.next = new ListNode(2);
        list4.next.next = new ListNode(3);
        list4.next.next.next = new ListNode(4);
        list4.next.next.next.next = new ListNode(5);
        list4.next.next.next.next.next = new ListNode(6);
        s.middleNode(list4);
        // Should be 4

    }
}