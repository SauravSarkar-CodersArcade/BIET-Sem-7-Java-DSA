package dsa.dataStructures.linear.linkedLists.problems.palindrome;
import java.util.List;
import java.util.Stack;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        next = null;
    }
}
public class PalindromeLinkedList {
    public static boolean isPalindromeList(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        // Traverse first time to store the nodes into the stack
        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        // Move the temp back to the head
        // Traverse & compare the stack top value with the list node values
        temp = head;
        while (temp != null){
            if(temp.data != stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);

        if(isPalindromeList(head1)){
            System.out.println("Palindrome.");
        }else {
            System.out.println("Not a Palindrome.");
        }

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(1);

        if(isPalindromeList(head2)){
            System.out.println("Palindrome.");
        }else {
            System.out.println("Not a Palindrome.");
        }
    }
}
