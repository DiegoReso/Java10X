package Objetos;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto =  new Uzumaki("Naruto",17,2,NivelNinja.GENNIN, Biju.KUROMA);
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

        Uchiha ninjaUchiha = new Uchiha("NinjaUchiha",17, 2,NivelNinja.JOUNNIN);
        ninjaUchiha.estrategiaNinja();
        ninjaUchiha.estrategiaDeBatalha(90);
        ninjaUchiha.estrategiaDeBatalha();
        ninjaUchiha.tacarKunai();
    }
}
