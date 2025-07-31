package oops.pillars.abstraction.abstractClasses;
abstract class Animal {
    // 1. normal or concrete method
    void eat(){
        System.out.println("Animal eats some food");
    }
    // 2. abstract method
    abstract void speed();
}
class Cat extends Animal {
    @Override
    void speed() {
        System.out.println("Cat runs fast...!!!");
    }
}
class Cheetah extends Animal{
    @Override
    void speed() {
        System.out.println("Cheetah runs very fast...!!!");
    }
}
class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cheetah cheetah = new Cheetah();
        cat.eat();
        cheetah.eat();
        cat.speed();
        cheetah.speed();
    }
}
