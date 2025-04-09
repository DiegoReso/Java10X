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
}
