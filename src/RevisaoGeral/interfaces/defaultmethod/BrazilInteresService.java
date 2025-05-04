package RevisaoGeral.interfaces.defaultmethod;

public class BrazilInteresService implements InterestService {

    private double interest;

    public BrazilInteresService(double interest) {
        this.interest = interest;
    }

    @Override
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
