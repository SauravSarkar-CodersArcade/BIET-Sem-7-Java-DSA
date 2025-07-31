package oops.pillars.abstraction.interfaces;

public interface Vehicle {
    void speed();
    void mileage();
}
class TwoWheeler implements Vehicle{

    @Override
    public void speed() {
        System.out.println("The speeds are average to fast");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage is from 35 kmpl to 90 kmpl");
    }

    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.speed();
        twoWheeler.mileage();
    }
}
