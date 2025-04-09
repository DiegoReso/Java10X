package Objetos;

public class Uchiha extends  Ninja implements SharinganInterface{

    public Uchiha() {
    }

    public Uchiha(String name, Integer age) {
        super(name, age);
    }

    public Uchiha(String name,Integer age, Integer numeroMissoesConcluidas, NivelNinja rank) {
        super(name, age, numeroMissoesConcluidas, rank);
    }

    public void sharinganAtivado() {
        System.out.println("Sharingan ativado Uchiha!");
    }

    @Override
    void estrategiaNinja() {
        System.out.println("Estrategia Ninja Uchiha! Ja completei " + numeroMissoesConcluidas + " de missoes!");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Estrategia de Batalha Uchiha ativada");
    }

    @Override
    public void estrategiaDeBatalha(int qi) {
        if(qi > 150){
            System.out.println("Seu qi eh: " + qi + " e vc eh um genio Uchiha");
        }else if(qi >= 130){
            System.out.println("Seu qi eh : " + qi + " e vc eh um ninja Uchiha promissor!");
        }else{
            System.out.println("Voce precisa treinar mais nobre Uchiha, seu qi esta apenas em " + qi + "!");
        }
    }


}
