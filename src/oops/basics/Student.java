package oops.basics;
public class Student {
    // Attributes
    String name;
    int rollNo;
    char section;
    String emailID;
    static String college = "BIET"; // Any common property or parameter
    Student(String name, int rollNo, char section, String emailID){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
        this.emailID = emailID;
    }
    public void printStudentDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Section: " + this.section);
        System.out.println("RollNo: " + this.rollNo);
        System.out.println("Email ID: " + this.emailID);
        System.out.println("College: " + college);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Samar",
                120, 'C', "samar@gmail.com");
        s1.printStudentDetails();
        Student s2 = new Student("Arun", 20,
                'C', "arun@gmail.com");
        s2.printStudentDetails();
        Student s3 = new Student("Ajay", 21,
                'C', "ajay@gmail.com");
        s3.printStudentDetails();
    }
}
