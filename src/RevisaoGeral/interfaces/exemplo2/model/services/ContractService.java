package RevisaoGeral.interfaces.exemplo2.model.services;

import RevisaoGeral.interfaces.exemplo2.model.entitiies.Contract;
import RevisaoGeral.interfaces.exemplo2.model.entitiies.Installments;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContractService {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private OnlinePaymentsService payment;

    public ContractService(OnlinePaymentsService payment) {
        this.payment = payment;
    }

    public void processContract(Contract contract, Integer months) {

        double valueContract = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dataParcela = contract.getDate().plusMonths(i);
            double interest = payment.interest(valueContract,i);
            double total = interest + valueContract;

            contract.setInstallments(new Installments(dataParcela, payment.paymentFee(total)));
        }
            contract.getInstallment();
    }
}
