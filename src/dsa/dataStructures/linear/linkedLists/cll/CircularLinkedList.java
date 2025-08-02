package dsa.dataStructures.linear.linkedLists.cll;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class CircularLinkedList {
    private Node head;
    public CircularLinkedList(){
        head = null; // Initially we take an empty list
    }
    public void printListElements(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + "->");
            temp = temp.next;
        }while (temp != head);
        System.out.println("head");
    }
    public void insertAtFront(int newValue){
        Node newNode = new Node(newValue);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != head){
            last = last.next;
        }
        last.next = newNode;
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(){
        // Homework....!!!
    }
    public void deleteFront(){
        // Homework....!!!
    }
    public void deleteEnd(){
        // Homework....!!!
    }
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtFront(10);
        cll.insertAtFront(20);
        cll.insertAtFront(30);
        cll.printListElements();
    }
}
