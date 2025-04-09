package Objetos;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(Integer age, String name) {
        super(name, age);
    }

    //sobrevarga construtor
    public Uzumaki(Integer age, String name, Integer numeroMissoesConcluidas, NivelNinja rank) {
        super(age, name, numeroMissoesConcluidas, rank);
    }



    @Override
    void estrategiaNinja() {
        System.out.println("Estrategia ninja dos Uzumaki ativada!");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome eh "+ name +"  e essa eh minha Estrategia de Batalha dos Uzumaki rolando a vera!");
    }
}
