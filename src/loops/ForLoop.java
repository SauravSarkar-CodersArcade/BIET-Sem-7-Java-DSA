package loops;
public class ForLoop {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        int max = ((x + y) + Math.abs(x-y))/2;
        int min = ((x + y) - Math.abs(x-y))/2;
        System.out.println(max);
        System.out.println("x = " + x + " y = " + y);
    }
}
