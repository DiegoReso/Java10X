package RevisaoGeral.geral;

public class Product {

    String name;
    double price;
    int quantity;

    double totalValueStock(){
        return price * quantity;
    }

    void addProducts(int quantity){
        this.quantity += quantity;
    }

    void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product data: "
                + name + ", $ "
                + String.format("%.2f", price) + ", "
                + quantity + " units"
                + ", Total: $ " + String.format("%.2f", totalValueStock());
    }
}
