package oops.basics;
public class TypesOfVariables {
    static int x = 30; // Static Variable
    static String s = "BIET";
    int y = 20; // Instance variable

    public static void main(String[] args) {
        System.out.println(x);
    }
}
class Demo {
    public static void main(String[] args) {
        System.out.println(TypesOfVariables.x);
        System.out.println(TypesOfVariables.s);
        System.out.println(new TypesOfVariables().y);
    }
}
