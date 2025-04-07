package Nivelntermediario;

public class Uzumaki extends Ninja{
    public Uzumaki(String name,Integer age,String village){
        super(name,age,village);
    }

    void ativarModoSabio(){
        System.out.println("Meu nome eh " + this.getName() + " e estou ativando o modo sabio");
    }

}
