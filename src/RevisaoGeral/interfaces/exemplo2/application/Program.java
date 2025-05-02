package RevisaoGeral.interfaces.exemplo2.application;

import RevisaoGeral.interfaces.exemplo2.model.entitiies.Contract;
import RevisaoGeral.interfaces.exemplo2.model.services.ContractService;
import RevisaoGeral.interfaces.exemplo2.model.services.PaypalService;

import java.text.ParseException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");
        int contractNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String date = sc.nextLine();
        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int installments = sc.nextInt();

        Contract contract = new Contract(contractNumber, LocalDate.parse(date,formatter), contractValue);

        ContractService service = new ContractService(new PaypalService());
        System.out.println("Parcelas");
        service.processContract(contract,installments);




    }
}
