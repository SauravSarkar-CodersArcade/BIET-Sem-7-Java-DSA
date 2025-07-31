package oops.pillars.inheritance.multi;
public class SimpleCalculator {
    void add(int a, int b){
        System.out.println("Sum: " + (a+b));
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void subtract(int a, int b){
        System.out.println("Difference: " + (a-b));
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator {
    void product(int a, int b){
        System.out.println("Product: " + (a*b));
    }
    void division(int a, int b){
        System.out.println("Division: " + (a/b));
    }
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        SimpleCalculator c1 = new SimpleCalculator();
        c1.add(1,2);
        System.out.println("---------------------------------------");
        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.add(3,4);
        c2.subtract(10,5);
        System.out.println("---------------------------------------");
        SuperAdvancedCalculator c3 = new SuperAdvancedCalculator();
        c3.add(2,3);
        c3.subtract(4,5);
        c3.division(10,5);
        c3.product(1,100);
        System.out.println("---------------------------------------");
    }
}
