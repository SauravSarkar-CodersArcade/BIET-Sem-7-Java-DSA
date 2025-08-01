package dsa.dataStructures.linear.queues;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        // Not allowed because it's an interface
        // Queue queue = new Queue<>();
        Queue<String> queue = new LinkedList<>();
        // add() or offer(), remove() or poll()
        queue.add("Apple"); // Throw an exception if the queue is full
        queue.offer("Banana"); // Return false if we can't add
        queue.offer("Avocado");
        System.out.println("Queue: " + queue);
        System.out.println("Head/Front Element: " + queue.peek());
        // Throw an exception if the queue is empty
        System.out.println("Removed:(remove)" + queue.remove());
        // Return false if we can't remove
        System.out.println("Removed:(poll)" + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}
