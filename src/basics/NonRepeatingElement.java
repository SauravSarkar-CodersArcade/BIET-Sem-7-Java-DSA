package basics;
public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,1,3,4,2,5};
        int result = 0;
        for (int i=0; i< arr.length; i++){
            result = result ^ arr[i];
        }
        System.out.println("The non-repeating element is: " + result);
    }
}
