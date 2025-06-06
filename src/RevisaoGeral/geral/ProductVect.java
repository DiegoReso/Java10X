package RevisaoGeral.geral;

public class ProductVect {
    private String name;
    private  double price;

    public ProductVect(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductVect{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
