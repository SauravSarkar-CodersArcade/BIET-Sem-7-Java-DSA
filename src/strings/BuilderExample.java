package strings;
public class BuilderExample {
    public void stringAppend(){
        StringBuilder buffer = new StringBuilder("BIET");
        System.out.println("Original String: " + buffer);
        buffer.append(" ISE");
        System.out.println("New String: " + buffer);
    }
    public void stringInsert(){
        StringBuilder buffer = new StringBuilder("JA");
        System.out.println("Original String: " + buffer);
        buffer.insert(1, "AV"); // JAVA
        System.out.println("New String: " + buffer);
    }
    public void stringReverse(){
        StringBuilder buffer = new StringBuilder("ESI-TEIB");
        System.out.println("Original String: " + buffer);
        buffer.reverse();
        System.out.println("New String: " + buffer);
    }
    public static void main(String[] args) {
        new BuilderExample().stringAppend();
        new BuilderExample().stringInsert();
        new BuilderExample().stringReverse();
    }
}
