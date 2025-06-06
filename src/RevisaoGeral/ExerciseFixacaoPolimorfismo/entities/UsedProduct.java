package RevisaoGeral.ExerciseFixacaoPolimorfismo.entities;

import RevisaoGeral.ExerciseFixacaoPolimorfismo.application.Program;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Produto {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return "Name " + name + " (used) - Price R$" + price + " Manufacture: " + sdf.format(manufactureDate);
    }
}
