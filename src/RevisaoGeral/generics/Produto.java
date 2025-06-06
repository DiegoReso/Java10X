package RevisaoGeral.generics;

public class Produto implements Comparable<Produto> {

    private String name;
    private Double price;

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

    @Override
    public int compareTo(Produto o) {
        return price.compareTo(o.getPrice());
    }

    @Override
    public String toString() {
        return  name + " " +
                 price
              ;
    }
}
