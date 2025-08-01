package oops.nestedClasses;
public class Outer {
    private int x = 20;
    class Inner {
        void display(){
            System.out.println("The value of x is: " + x);
        }
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        System.out.println(out.x);
        // Outer_Class.Inner_Class in_obj = out_obj.new Inner_Class();
        Outer.Inner in = out.new Inner();
        in.display();
    }
}
