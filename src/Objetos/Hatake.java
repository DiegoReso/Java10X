package Objetos;

public class Hatake extends Ninja implements SharinganInterface,AnbuInterface{

    public Hatake() {
    }

    public Hatake(String name, Integer age) {
        super(name, age);
    }

    public Hatake(String name,Integer age, Integer numeroMissoesConcluidas, NivelNinja rank) {
        super(name ,age, numeroMissoesConcluidas, rank);
    }

    public void sharinganAtivado() {
        System.out.println("Sharingan ativado Hatake!");
    }

    void boasVindas(){
        System.out.println("Eu sou um hatake");
    }

    void estrategiaNinja() {
        System.out.println("Estrategia Ninja dos Hatake!");
    }

    public void ninjaDeElite() {
        System.out.println("Ninja de elite Hatake!");
    }
}
