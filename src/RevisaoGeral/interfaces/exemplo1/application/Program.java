package RevisaoGeral.interfaces.exemplo1.application;

import RevisaoGeral.interfaces.exemplo1.model.entities.CarRental;
import RevisaoGeral.interfaces.exemplo1.model.entities.Vehicle;
import RevisaoGeral.interfaces.exemplo1.model.services.BrazilTaxService;
import RevisaoGeral.interfaces.exemplo1.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program{
    public static void main(String[] args) {
        System.out.println();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        CarRental rent = new CarRental(LocalDateTime.parse("25/06/2018 10:30", dtf),LocalDateTime.parse("27/06/2018 " +
                "14:40", dtf),new Vehicle("CIVIC"));


        RentalService service = new RentalService(10.0, 130.0,new BrazilTaxService());
        service.processInvoice(rent);
        System.out.println("INVOICE");
        System.out.println("Pagamento basico: " + rent.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + rent.getInvoice().getTax());
        System.out.println("Pagamento total: " + rent.getInvoice().totalPayment());

    }
}
