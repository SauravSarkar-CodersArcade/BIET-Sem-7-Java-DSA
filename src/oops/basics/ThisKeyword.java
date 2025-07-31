package oops.basics;
public class ThisKeyword {
    String i;
    void change(String i){
        this.i = i;
    }
    void display(){
        System.out.println("The value of i is: " + i);
    }
    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.change("Saurav");
        obj.display();
    }

}
