package dsa.dataStructures.nonLinear.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallestElement {
    public static void kthSmallestElement(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new
                PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr){
            maxHeap.add(num);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        System.out.println("The " + k + "th smallest element is: " +
                maxHeap.peek());
    }
    public static void main(String[] args) {
        int[] arr = {7,4,3,10,20,8};
        int k = 3;
        kthSmallestElement(arr, k);
    }
}
