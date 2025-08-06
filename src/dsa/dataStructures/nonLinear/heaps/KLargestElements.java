package dsa.dataStructures.nonLinear.heaps;
import java.util.PriorityQueue;
public class KLargestElements {
    public static void findKLargest(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // 1. Insert all elements into the min heap
        // 2. Remove the elements from the min heap till size is > k
        for (int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        // 3. Print the remaining k-largest elements
        System.out.println("The " + k + " largest elements are: ");
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,19,7,8,21,4};
        // Sorting is not recommended because it takes more time
        // 4,7,8,10,19,21 -> n log n + O(n)
        int k = 3;
        findKLargest(arr,k);
    }
}
