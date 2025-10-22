package oct21;

public class Bmo extends BankOfCanada{
    @Override
    public double rateOfInterest() {
        return 1.99 + super.primeRate;
    }

}
