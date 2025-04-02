package Colecoes;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String[] ninjas = new String[4];

        ninjas[0] = "Sasuke Uchiha";
        ninjas[1] = "Sakura Haruno";
        ninjas[2] = "Hinata Hyuga";
        ninjas[3] = "Kakashi Hatake";

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }

        //redeclarar o Array
        System.out.println("*****Redeclarando Array*****");
        ninjas = new String[4];
        ninjas[0] = "Hashiama";
        ninjas[1] = "Kakashi";
        ninjas[2] = "Minato";
        ninjas[3] = "Hiruzen";


        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }

        //desafio array
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;
        int ninjasCadastrados = 0;
        int NUMERO_MAX = 3;
        String[] ninjasDesafio = new String[NUMERO_MAX];

        while(opcao != 3){

            System.out.println("\n======Menu Ninja======");
            System.out.println("1 - Para Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opcao");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if(ninjasCadastrados < NUMERO_MAX){
                        System.out.println("Entre com o nome do " + (ninjasCadastrados + 1) + " Ninja");
                        String nomeNinja = scanner.nextLine();
                        ninjasDesafio[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    }else{
                        System.out.println("A lista de ninjas esta cheia");
                    }
                    break;

                case 2:
                    if(ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja encontrado");
                    }else{
                        for(int i = 0; i < ninjasDesafio.length; i++) {
                            System.out.println(ninjasDesafio[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Programa encerrado!");
                    break;
            }
        }
    }
}
