package Nivelntermediario;

public class Main {
    public static void main(String[] args) {
        //Criar ninja Naruto
        Ninja ninja = new Ninja("Naruto", 20, "Folha");
         ninja.getName();
        System.out.println(ninja.anosParaSerHokage(30));

        Uchiha sasuke = new Uchiha("Sasuke", 18,"Folha");
        sasuke.sharinganAtivado();

        Uzumaki naruto = new Uzumaki("Naruto",17,"Folha");
        naruto.ativarModoSabio();

        Boruto boruto = new Boruto("Boruto",8,"Folha");
        boruto.ativarOKarma();
        boruto.ativarJourgan();
        boruto.ativarModoSabio();

    }
}
