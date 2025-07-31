package oops.pillars.polymorphism.overloading;
public class Addition {
    static void addition(int a, int b){
        System.out.println(a+b);
    }
    static void addition(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void addition(float a, float b){
        System.out.println("Float Called");
        System.out.println(a+b);
    }
    static void addition(double a, double b){
        System.out.println("Double Called");
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        addition(1,2);
        addition(1,2,3);
        addition(1.4f,4.5f); // Float
        addition(1.245, 2.456); // Double
    }
}
