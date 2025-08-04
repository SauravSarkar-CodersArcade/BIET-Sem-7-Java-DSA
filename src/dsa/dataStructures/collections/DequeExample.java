package dsa.dataStructures.collections;
import java.util.Deque;
import java.util.LinkedList;
public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        // Stack Behaviour
        deque.push(10);
        deque.push(20);
        deque.push(30);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.pop()); // This removes the top element
        System.out.println(deque);
        // Queue behaviour
        deque.add(9);
        deque.add(8);
        deque.add(7);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.remove()); // This removes the front element
    }
}
