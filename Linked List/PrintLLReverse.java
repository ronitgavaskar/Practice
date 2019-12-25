import java.util.*;
public class PrintLLReverse {

    public void printReverse(ListNode head) {
        Stack<Integer> values = new Stack<>();

        while (head != null) {
            values.push(head.val);
            head = head.next;
        }

        while (!values.isEmpty()) {
            System.out.println(values.pop());
        }
    }


    public static void main(String args[]) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        PrintLLReverse s = new PrintLLReverse();
        s.printReverse(node1);


        
    }
}