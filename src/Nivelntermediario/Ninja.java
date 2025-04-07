package Nivelntermediario;

public class Ninja {
    private String name;
    private Integer age;
    private String village;

    public Ninja(String name,Integer age,String village){
        this.name = name;
        this.age = age;
        this.village = village;
    }

    String getName(){
        return this.name;
    }

    Integer anosParaSerHokage(Integer age){
        return age - this.age  ;
    }
}
