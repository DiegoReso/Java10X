package Generics;

public class Joias {

    private String name;

    public Joias(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Joia{" +
                "name='" + name + '\'' +
                '}';
    }
}
