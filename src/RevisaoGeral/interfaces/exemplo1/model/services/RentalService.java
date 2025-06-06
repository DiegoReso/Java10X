package RevisaoGeral.interfaces.exemplo1.model.services;

import RevisaoGeral.interfaces.exemplo1.model.entities.CarRental;
import RevisaoGeral.interfaces.exemplo1.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private double pricePerHour;
    private double pricePerDay;
    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService tax) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = tax;
    }

    public void processInvoice(CarRental carRental){
       double minutes =  Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
       double hours = minutes /60.0;

       double basicPayment;
       if(hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
       }else{
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
       }

       double tax = taxService.tax(basicPayment);
       carRental.setInvoice(new Invoice(basicPayment,tax));

    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTax() {
        return taxService;
    }

}
