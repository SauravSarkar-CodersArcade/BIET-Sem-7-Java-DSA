package dsa.dataStructures.linear.linkedLists.dll;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        prev = null;
        next = null;
    }
}
public class DoublyLinkedList {
    Node head;
    // Insert at end
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }
    // Delete from end
    public void remove(){
        // Empty list
        if(head == null){
            System.out.println("Empty list, can't delete tail.");
            return;
        }
        // Single node
        if(head.next == null){
            head = null;
            return;
        }
        // Multiple nodes
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        // Make the second last the new tail
        // Point the tail to null
        last.prev.next = null;
    }
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position <= 0){
            System.out.println("Invalid Position.");
            return;
        }
        if(position == 1){
            newNode.next = head;
            if(head != null){ // For multiple nodes
                head.prev = newNode;
            }
            head = newNode;
            return;
        }
        // Multiple nodes & pos != 1, some other value
        Node temp = head;
        int i = 1;
        while (temp != null && i < position - 1){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            System.out.println("Position is out of range..!!");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if(temp.next != null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }
    public void display(){
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.display();
        dll.remove();
        dll.display();
        dll.insertAtPosition(4,3);
        dll.display();
        dll.insertAtPosition(0,2);
        dll.display();
        dll.insertAtPosition(100,-10);
    }

}
