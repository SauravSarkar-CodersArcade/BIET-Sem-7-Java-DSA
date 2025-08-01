package dsa.dataStructures.linear.queues;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryGenerator {
    public static void generateBinaryNumbers(int N){
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        while (N-- > 0){
            String current = queue.poll();
            System.out.print(current + " ");
            queue.offer(current + "0");
            queue.offer(current + "1");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int N = 5;
        generateBinaryNumbers(N);
    }
}
