package oct21;

public class Scotia extends BankOfCanada{
    @Override
    public double rateOfInterest() {
        return 0.99;
    }

    public void accountInfo(){
        System.out.println("Scotia bank account info ");
    }
}
