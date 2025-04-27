package RevisaoGeral.exerciseUML;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HourContract {
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

    private Date date;
    private Double valuePerHour;
    private Integer hours;


    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    double totalValue(){
        return hours * valuePerHour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourContract ->" +
                "date = " + date +
                ", valuePerHour = " + valuePerHour +
                ", hours = " + hours +
                '}';
    }
}
