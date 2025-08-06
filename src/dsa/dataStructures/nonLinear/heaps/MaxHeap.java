package dsa.dataStructures.nonLinear.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        // By-default it is a min heap
        // We use reverseOrder() for making MaxHeap
        PriorityQueue<Integer> maxHeap = new
                PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(2);
        maxHeap.add(0);
        maxHeap.add(4);
        System.out.println("Max Heap: " + maxHeap);
        System.out.println("Max value: " + maxHeap.poll());
    }
}
