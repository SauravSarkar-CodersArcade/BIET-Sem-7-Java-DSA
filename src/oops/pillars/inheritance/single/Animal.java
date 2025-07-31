package oops.pillars.inheritance.single;
public class Animal { // Super / Parent
    public void eat(){
        System.out.println("Animal eats food...!!!");
    }
}
class Cat extends Animal { // Base / Sub / Child
    public void climb(){
        System.out.println("Cat can climb trees & walls....!!");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.climb();
    }
}
