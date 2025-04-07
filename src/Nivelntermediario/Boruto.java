package Nivelntermediario;

public class Boruto extends Uzumaki implements  HyugaUzumaki{

    public Boruto(String name,Integer age,String village){
        super(name,age,village);
    }

    @Override
    public void ativarJourgan() {
        System.out.println("Ativando Jougan!");
    }

    @Override
    public void ativarOKarma() {
        System.out.println("Ativando o Karma!");
    }
}
