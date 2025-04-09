package Objetos;

public class Uzumaki extends Ninja{

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String name, Integer age) {
        super(name, age);
    }

    //sobrevarga construtor
    public Uzumaki(String name,Integer age, Integer numeroMissoesConcluidas, NivelNinja rank) {
        super(name,age, numeroMissoesConcluidas, rank);
    }
    //sobrecarga para adicionar Biju
    public Uzumaki(String name,Integer age, Integer numeroMissoesConcluidas, NivelNinja rank,Biju biju) {
        super(name,age, numeroMissoesConcluidas, rank);
        this.biju = biju;
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
