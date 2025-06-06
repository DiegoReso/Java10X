package RevisaoGeral.interfaces.exemplo2.model.entitiies;

import java.time.LocalDate;
import java.util.Date;

public class Installments {

    private LocalDate dueDate;
    private Double amount;

    public Installments(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate + " R$ " + amount ;
    }
}
