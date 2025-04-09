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

    //Todo ninja vai fazer obrigatoriamente
    final void tacarKunai(){
        System.out.println("Tacando a Kunai!");
    }

    abstract void estrategiaNinja();

    void soltarMagia(){
        System.out.println("soltando magia");
    }

    public void estrategiaDeBatalha() {
        System.out.println("Essa eh minha estrategia de batalha");
    }

    public void estrategiaDeBatalha(int qi) {
        if(qi > 150){
            System.out.println("Seu qi eh: " + qi + " e vc eh um genio");
        }else if(qi >= 130){
            System.out.println("Seu qi eh : " + qi + " e vc eh um ninja promissor!");
        }else{
            System.out.println("Voce precisa treinar mais, seu qi esta apenas em " + qi + "!");
        }
    }
}
