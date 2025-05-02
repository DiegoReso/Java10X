package RevisaoGeral.geral;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //do-while
        char resp;
        do {
            System.out.print("Entre com a temperatura em Celius: ");
            double C = scanner.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente a Fahrenheit: %.1f%n", F);
            System.out.println("Deseja continuar (s/n)");
            resp = scanner.next().charAt(0);
        } while (resp != 'n');


        //for
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicao: " + i);
        }

        //while
        int inteiro = 1;
        int soma = 0;
        while (inteiro != 0) {

            System.out.println("Entre com o numero inteiro, para parar o programa digite '0' ");
            inteiro = scanner.nextInt();
            soma += inteiro;
        }
        System.out.println("A soma eh: " + soma);


        //condicao ternaria
        boolean isEmpty = true;
        String empty = isEmpty ? " Vazio " : " Nao Vazio ";

        System.out.println(empty);

        int x = 5;

        if (x > 0) {
            System.out.println("Imprimir se x for maior do que 5");
        } else {
            System.out.println("Imprimir se x for menor do que 5");
        }

        //praticando

        System.out.println("Entre com os minutos consumidos no plano, lembrando que vc tem 100 minutos por 50 reais, cada minuto adicional sera cobrado 2 reais");
        int minutos = scanner.nextInt();

        if (minutos < 100) {
            System.out.println(" Voce ainda nao consumiu todo seu plano, vc ainda tem " + (100 - minutos) + " " +
                    "minutos restantes no seu plano");
        } else if (minutos > 100) {
            System.out.println("Voce ultrapassou o valor da franquia de 100 minutos  e voce tera que pagar " + (minutos - 100) * 2 + " de valor adicional a sua franquia");
        } else {
            System.out.println("Seu plano foi consumido 100%, fale mais por 2 reais o minuto!");
        }

        //switch case
        int diaDaSemana = 2;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Dia da semana: domingo");
                break;
            case 2:
                System.out.println("Dia da semana: segunda");
                break;
            case 3:
                System.out.println("Dia da semana: terca");
                break;
            case 4:
                System.out.println("Dia da semana: quarta");
                break;
            case 5:
                System.out.println("Dia da semana: quinta");
                break;
            case 6:
                System.out.println("Dia da semana: sexta");
                break;
            case 7:
                System.out.println("Dia da semana: sabado");
                break;
            default:
                System.out.println("Dia da semana invalido");
                break;
        }
    }
}
