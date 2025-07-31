package oops.basics;
public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployeeID(10101);
        e1.setEmployeeName("Arun");
        System.out.println(e1.getEmployeeID());
        System.out.println(e1.getEmployeeName());
    }
}
