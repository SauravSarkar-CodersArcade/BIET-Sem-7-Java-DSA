package dsa.dataStructures.linear.linkedLists.sll;
class LL{
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null; // Initially it's connected to null
            size++;
        }
    }
    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        // Create a new node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        // Create a new node
        Node newNode = new Node(data);
        // Empty List
        if(head == null){
            head = newNode;
            return;
        }
        // Multiple nodes
        // We need to traverse the list & find the last node
        // Then we will add the newNode after the last node
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }
    public void removeFirst(){
        // Empty List
        if(head == null){
            System.out.println("Empty List. Can't remove head.");
            return;
        }
        // For a single element head will point to null
        // For multiple elements head will point to next node
        head = this.head.next;
        size--; // Decrement the count of number of nodes
    }
    public void removeLast(){
        // Empty List
        if(head == null){
            System.out.println("Empty List. Can't remove tail.");
            return;
        }
        // Single Element
        if(head.next == null){
            head = null;
            return;
        }
        // For multiple nodes we will find the last & delete it
        Node current = head;
        Node last = head.next;
        while (last.next != null){
            current = last;
            last = last.next;
        }
        current.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("ISE");
        list.addFirst("in");
        list.addFirst("is");
        list.addFirst("Bindhya");
        list.addFirst("Student");
        list.addLast("Section");
        list.addLast("C");
        list.addLast("in");
        list.addLast("BIET");
        list.addLast("College");
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
    }
}

