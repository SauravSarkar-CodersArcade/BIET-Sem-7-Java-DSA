package oops.pillars.polymorphism.overriding;
public class RBI {
    double rateOfInterest(){
        return 6.9;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest(){
        return 7.1;
    }
}
class IDBI extends RBI{
    @Override
    double rateOfInterest(){
        return 6.5;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest(){
        return 7.8;
    }
}
class Overriding {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        HDFC hdfc = new HDFC();
        IDBI idbi = new IDBI();
        ICICI icici = new ICICI();
        System.out.println("RBI has rate of: " + rbi.rateOfInterest()+"%");
        System.out.println("HDFC has rate of: " + hdfc.rateOfInterest()+"%");
        System.out.println("IDBI has rate of: " + idbi.rateOfInterest()+"%");
        System.out.println("ICICI has rate of: " + icici.rateOfInterest()+"%");
    }
}