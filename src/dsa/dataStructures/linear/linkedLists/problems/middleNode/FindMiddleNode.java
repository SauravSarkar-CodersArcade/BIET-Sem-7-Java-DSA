package dsa.dataStructures.linear.linkedLists.problems.middleNode;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class FindMiddleNode {
    public static Node findMiddleNode(Node head){
        // If it is empty, we don't have a middle node
        if(head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;   // 1 step
            fast = fast.next.next; // 2 steps
        }
        return slow;
    }
    public static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        System.out.print("List With Odd Number of Nodes: ");
        printList(head1);
        System.out.println("Middle Node: " +
                findMiddleNode(head1).data);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);
        head2.next.next.next.next.next = new Node(6);
        System.out.print("List With Even Number of Nodes: ");
        printList(head2);
        System.out.println("Middle Node: " +
                findMiddleNode(head2).data);
    }
}
