package RevisaoGeral.ExerciseFixacaoPolimorfismo.entities;

import RevisaoGeral.exerciseFixacao.Product;

public class ImportedProduct extends Produto {

    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    double totalPrice(){
        return price + customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return "Name" + name + " - " + " Price R$" + totalPrice() + " - (Custom fee: " + customsFee + ")";
    }
}
