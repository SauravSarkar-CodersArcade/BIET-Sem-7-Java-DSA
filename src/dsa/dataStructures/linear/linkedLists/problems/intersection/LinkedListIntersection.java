package dsa.dataStructures.linear.linkedLists.problems.intersection;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class LinkedListIntersection {
    public static Node findIntersection(Node head1, Node head2){
        Node p1 = head1, p2 = head2;
        Node head = null, tail = null;
        while (p1 != null && p2 != null){
            if(p1.data < p2.data){
                p1 = p1.next;
            }else if(p2.data < p1.data){
                p2 = p2.next;
            }else {
                // Match Found
                Node newNode = new Node(p1.data); // or p2.data;
                if(head == null){
                    head = tail = newNode;
                }else {
                    tail.next = newNode;
                    tail = newNode;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return head;
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
        head1.next.next.next.next = new Node(6);
        System.out.print("List 1: ");
        printList(head1);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);
        System.out.print("List 2: ");
        printList(head2);

        Node head = findIntersection(head1, head2);
        System.out.print("Intersection List : ");
        printList(head);
    }
}
