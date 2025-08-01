package oops.association;
public class Patient {
    String patientName;
    int patientAge;
    String doa, disease;
    Information info;
    Payment pay;
    public Patient(String patientName, int patientAge, String doa, String disease,
                   Information info, Payment pay) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doa = doa;
        this.disease = disease;
        this.info = info;
        this.pay = pay;
    }
    public void patientDetails(){
        System.out.println("The details of the patient are: ");
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: " + this.patientAge);
        System.out.println("Date Of Arrival: " + this.doa);
        System.out.println("Disease: " + this.disease);
        System.out.println("Block Number: " + this.info.blockNo);
        System.out.println("Floor Number: " + this.info.floorNo);
        System.out.println("Room Number: " + this.info.roomNo);
        System.out.println("Bed Number: " + this.info.bedNo);
        System.out.println("Admission fees: " + this.pay.admFees);
        System.out.println("Registration Fees: " + this.pay.regFees);
        System.out.println("Balance Amount: " + this.pay.balAmt);
    }

    public static void main(String[] args) {
        Information info1 = new Information("A", 3,
                301, 5);
        Information info2 = new Information("C", 2,
                205, 7);
        Payment pay1 = new Payment(20000, 10000,
                3000);
        Payment pay2 = new Payment(10000, 5000,
                2000);
        Patient p1 = new Patient("XYZ", 24,
                "01/08/2025", "Malaria", info1, pay1);
        Patient p2 = new Patient("ABC", 22,
                "31/07/2025", "Jaundice", info2, pay2);
        p1.patientDetails();
        p2.patientDetails();
    }
}
