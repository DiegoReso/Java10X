package NivelBasico.TiposDeDados.Condicoes;

import java.util.Scanner;

public class SwitchCasesEstudos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ninjas!");
        System.out.println("1 - Naruto Uzamaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        System.out.println("Escolha um personagem");
        int numeroDoNinja = scanner.nextInt();

        switch (numeroDoNinja){
            case 1:
                System.out.println("O ninja escolhido foi Naruto, o proximo hokage");
                break;
            case 2:
                System.out.println("O ninja escolhido foi Sasuke, o ninja mais revoltado de todos!");
                break;
            case 3:
                System.out.println("A ninja escolhida foi a Sakura, a personagem feminina mais legal!");
                break;
            default:
                System.out.println("Numero escolhido invalido!");
                break;
        }
        scanner.close();
    }
}
