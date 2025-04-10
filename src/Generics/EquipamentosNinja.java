package Generics;

public class EquipamentosNinja {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipamentosNinja(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
