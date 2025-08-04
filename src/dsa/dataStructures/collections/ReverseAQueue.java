package dsa.dataStructures.collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseAQueue {
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        // Step 1: Traverse the queue & push the elements onto stack
        while (!q.isEmpty()){
            s.push(q.poll());
        }
        // Step 2: Traverse the stack & remove the elements
        // Push the elements into the queue
        while (!s.empty()){
            q.offer(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Before: " + queue);
        reverseQueue(queue);
        System.out.println("After: " + queue);
    }
}
