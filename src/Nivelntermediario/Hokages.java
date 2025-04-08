package Nivelntermediario;

public abstract class Hokages {

    private String name;
    private Integer age;
    private String village;

    public Hokages(String name , Integer age, String village) {
        this.age = age;
        this.village = village;
        this.name = name;
    }

    abstract void sabedoriaHokage();

}
