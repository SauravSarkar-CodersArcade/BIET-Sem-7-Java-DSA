package dsa.dataStructures.linear.stacks;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(3);
        integers.push(5);
        System.out.println(integers);
        System.out.println("Top element: " + integers.peek());
        System.out.println("Current Size: " + integers.size());
    }
}
