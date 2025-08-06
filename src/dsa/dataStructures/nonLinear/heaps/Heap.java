package dsa.dataStructures.nonLinear.heaps;
public class Heap {
    private int[] arr;
    private int size;
    public Heap(){
        arr = new int[101]; // 100 elements + 0th element
        arr[0] = -1; // Sentinel Value // Never Accessed
        size = 0; // Initial heap is empty
    }
    public void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void print(){
        for (int i=1; i<=size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void insert(int val){
        size++;
        arr[size] = val;
        int index = size;
        while (index > 1){
            int parent = index / 2;
            if(arr[parent] < arr[index]){
                swap(parent, index);
                index = parent; // Keep checking the parents
            }else {
                return; // The element is at its correct position
            }
        }
    }
    public void deleteFromHeap(){
        if(size == 0){
            System.out.println("Heap is empty, can't remove element.");
            return;
        }
        // Move the last element to the root
        arr[1] = arr[size];
        // Decrement the size to delete the duplicate element
        size--;
        int i = 1; // Problem Index
        while (i < size){
            int leftIndex = 2*i;
            int rightChild = 2*i+1;
            if(i <= size && arr[i] < arr[leftIndex]){
                swap(i, leftIndex);
                i = leftIndex;
            }else if(i <= size && arr[i] < arr[rightChild]){
                swap(i, rightChild);
                i = rightChild;
            }else {
                return;
            }
        }
    }
    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;
        if(left <= n && arr[largest] < arr[left]){
            largest = left;
        }
        if(right <= n && arr[largest] < arr[right]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            // recursion for all the indices
            heapify(arr, n, largest);
        }
    }
    public static void heapSort(int[] arr, int n){
        int size = n;
        while (size > 1){
            // Swap the first & last element
            int temp  = arr[1];
            arr[1] = arr[size];
            arr[size] = temp;
            // Decrement the size
            size--;
            // Propagate the root (index 1 element) to correct pos
            heapify(arr,size, 1);
        }
    }
    public static void main(String[] args) {
        Heap maxHeap = new Heap();
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(50);
        maxHeap.insert(10);
        maxHeap.insert(40);
        maxHeap.print();
        maxHeap.deleteFromHeap();
        maxHeap.print();
        int[] arr = {-1, 54, 53, 55, 52, 50};
        int n = 5;
        for(int i=n/2; i>0; i--){
            heapify(arr, n, i);
        }
        System.out.println("Array after Heapify: ");
        for (int i=1; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        heapSort(arr, n);
        System.out.println("Array after Heap Sort (n log n): ");
        for (int i=1; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
