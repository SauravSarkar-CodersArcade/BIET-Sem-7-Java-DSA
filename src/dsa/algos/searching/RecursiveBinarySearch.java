package dsa.algos.searching;
public class RecursiveBinarySearch {
    static int recursiveBinarySearch(int[] arr, int key, int s, int e){
        if (s > e){
            return -1; // Not Found
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] < key){
            return recursiveBinarySearch(arr,key, mid+1, e);
        }else{
            return recursiveBinarySearch(arr,key,s,mid-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,9,12};
        int n = arr.length;
        System.out.println(recursiveBinarySearch(arr,60, 0,n-1));
    }
}
