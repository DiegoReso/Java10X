package Objetos;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto =  new Uzumaki();
        naruto.name = "Naruto";
        naruto.age = 17;
        naruto.soltarMagia();
        naruto.estrategiaNinja();
        naruto.estrategiaDeBatalha();

        Hatake kakashi = new Hatake();
        kakashi.name = "Kakashi";
        kakashi.age = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.numeroMissoesConcluidas = 2;
        kakashi.rank = NivelNinja.CHUNNIN;

        Uchiha ninjaUchiha = new Uchiha(17,"NinjavUchiha", 2,NivelNinja.JOUNNIN);
        ninjaUchiha.estrategiaNinja();



    }


}
