package oct21;

public class Pragra extends BankOfCanada{
    @Override
    public double rateOfInterest() {
        return 0.44 + super.primeRate;
    }
}
