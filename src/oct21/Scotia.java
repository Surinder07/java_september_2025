package oct21;

public class Scotia extends BankOfCanada{

    double primeRate = 6.99;
    @Override
    public double rateOfInterest() {
        //super.displayRateOfInterest();  to call parent class method
        // super.primeRate : to call parent class variable
        return 0.99 + super.primeRate;
    }

    public void accountInfo(){
        System.out.println("Scotia bank account info ");
    }
}
