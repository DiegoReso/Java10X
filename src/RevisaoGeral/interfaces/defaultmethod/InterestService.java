package RevisaoGeral.interfaces.defaultmethod;

public interface InterestService {

    double getInterest();

    default double payment(double amount, int months){
        return amount * Math.pow(1.0 + getInterest() / 100.0, months);
    }

}
