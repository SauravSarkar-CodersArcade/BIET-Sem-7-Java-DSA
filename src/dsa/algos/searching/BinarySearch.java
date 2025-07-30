package dsa.algos.searching;
public class BinarySearch {
    static int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                s =  mid + 1; // Key is on the right hand side
            }else {
                e = mid - 1; // Key is on the left hand side
            }
        }
        return -1; // Element not found
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,9,10};
        System.out.println(binarySearch(arr, 9));
    }
}
