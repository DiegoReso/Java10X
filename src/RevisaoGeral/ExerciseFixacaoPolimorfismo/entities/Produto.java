package RevisaoGeral.ExerciseFixacaoPolimorfismo.entities;

public class Produto {
    protected String name;
    protected Double price;

    public Produto() {
    }

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag(){
        return "Product name: " + name + ", Price R$" + price;
    }
}
