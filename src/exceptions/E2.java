package exceptions;
public class E2 {
    {
        System.out.println("IIB 2");
    }
    public static void main(String[] args) {
        new E2();
        int i, j, k = 0;
        i = 10;
        j = 10;
        try {
            k = i / j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[9]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            // System.out.println(e);
            System.out.println("Some issue with the code..!!");
            // e.printStackTrace(); Details like type, line number, etc
        }catch (Exception e){
            System.out.println("Something unexpected happened...!!!");
        }finally {
            System.out.println("End of execution...!!!");
        }
        System.out.println("The value of k is " + k);
        new E2();
    }
    static {
        System.out.println("Start of execution...!!!");
    }
    {
        System.out.println("IIB 1");
    }
}
