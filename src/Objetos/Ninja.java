package Objetos;

public abstract class Ninja implements EstrategiaDeBatalha{
    //TODO: Incluir novos 2 atributos: numeroMissioesConcluidas, Rank


    String name;
    Integer age;
    Integer numeroMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    //sobrecarga construtor
    public Ninja(String name,Integer age, Integer numeroMissoesConcluidas, NivelNinja rank) {
        this(name,age);
        this.numeroMissoesConcluidas = numeroMissoesConcluidas;
        this.rank = rank;
    }

    abstract void estrategiaNinja();

    void soltarMagia(){
        System.out.println("soltando magia");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa eh minha estrategia de batalha");
    }
}
