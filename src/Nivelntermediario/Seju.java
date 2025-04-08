package Nivelntermediario;

public class Seju extends Hokages {

    public Seju(String name, Integer age, String village){
        super(name,age,village);
    }

    @Override
    void sabedoriaHokage() {
        System.out.println("Utilizando sabedoria Hokage!");
    }
}
