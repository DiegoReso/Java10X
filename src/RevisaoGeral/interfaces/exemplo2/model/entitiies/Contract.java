package RevisaoGeral.interfaces.exemplo2.model.entitiies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<Installments> installments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public void setInstallments(Installments installment){
        installments.add(installment);
    }

    public void getInstallment(){
        for (Installments i : installments){
            System.out.println(i);
        }
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number=" + number +
                ", date=" + date +
                ", totalValue=" + totalValue +
                ", installments=" + installments +
                '}';
    }
}
