package oct21;

public  abstract class BankOfCanada {

    double primeRate = 4.70;

    public abstract double rateOfInterest();

    public final void displayRateOfInterest(){
        System.out.println("Rate of interest " + rateOfInterest());
    }
}
