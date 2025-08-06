package dsa.dataStructures.nonLinear.heaps;
import java.util.PriorityQueue;
public class MinHeap {
    public static void main(String[] args) {
        // By default it is a min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(2);
        minHeap.add(0);
        minHeap.add(4);
        System.out.println("Min Heap: " + minHeap);
        System.out.println("Min value: " + minHeap.poll());
    }
}
