package basics;
public class TwoUniqueElements {
    static void twoUniqueElements(int[] arr){
        int xorAll = 0;
        int n1 = 0, n2 = 0;
        for (int i=0; i<arr.length; i++){
            xorAll ^= arr[i];
        }
        int rightMostSetBit = xorAll & -xorAll;
        for(int i=0; i<arr.length; i++){
            if((arr[i] & rightMostSetBit) == 1){
                n1 ^= arr[i]; // XOR of group 1
            }else {
                n2 ^= arr[i]; // XOR of group 2
            }
        }
        System.out.println("N1 = " + n1 + " N2 = " + n2);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2};
        twoUniqueElements(arr);
    }
}
