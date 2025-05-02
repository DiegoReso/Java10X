package RevisaoGeral.interfaces.exemplo2.model.services;

public class PaypalService implements OnlinePaymentsService{

    @Override
    public double paymentFee(double amount) {
        return amount + amount * 0.02;
    }

    @Override
    public double interest(double amount, int months) {
        return amount  * (months / 100.0);
    }
}
