package RevisaoGeral.interfaces.exemplo2.model.services;

public interface OnlinePaymentsService {

    double paymentFee(double amount);
    double interest(double amount, int months);

}
