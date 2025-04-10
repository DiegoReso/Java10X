package DesafioIntermediario;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------********----------------");
        ListaNinjas<Ninja> ninjas = new ListaNinjas<>();
        ninjas.setNinjas(new Ninja("Naruto",17,"Folhas Cascade"));
        ninjas.setNinjas(new Ninja("Sasuke",23,"DomBosco Telha"));
        ninjas.setNinjas(new Ninja("Tobirama",45,"Fonseca Pistao"));
        ninjas.setNinjas(new Ninja("Minato",45,"Icarai das almas"));
        ninjas.setNinjas(new Ninja("Sakura",32,"Uniao Pantera"));

        ninjas.getNinjas();
        System.out.println("------------------********----------------");
        //deletando primeiro ninja
        System.out.println("Deletando primeiro ninja!");
        ninjas.deletarPrimeiroNinja();
        ninjas.getNinjas();
        //adiciona objeto na primeira posicao
        System.out.println("------------------********----------------");
        System.out.println("Adicionando elemento na primeira posicao e imprimindo lista");
        ninjas.adicionarNinjaPrimeiraPosicao(new Ninja("Kamikase",18,"Vera Parque"));

        //pega elemento pela posicao
        System.out.println("------------------********----------------");
        System.out.println("Captura elemento pelo indice");
        System.out.println(ninjas.exibeNinja(2));


    }
}
