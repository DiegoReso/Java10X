package RevisaoGeral;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        int x = 5;

        if (x > 0){
            System.out.println("Imprimir se x for maior do que 5");
        }else {
            System.out.println("Imprimir se x for menor do que 5");
        }

        //praticando

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com os minutos consumidos no plano, lembrando que vc tem 100 minutos por 50 reais, cada minuto adicional sera cobrado 2 reais");
        int minutos = scanner.nextInt();

        if(minutos < 100){
            System.out.println(" Voce ainda nao consumiu todo seu plano, vc ainda tem " + (100 - minutos) + " " +
                    "minutos restantes no seu plano");
        }else if(minutos > 100){
            System.out.println("Voce ultrapassou o valor da franquia de 100 minutos  e voce tera que pagar " + (minutos - 100) * 2 + " de valor adicional a sua franquia");
        }else{
            System.out.println("Seu plano foi consumido 100%, fale mais por 2 reais o minuto!");
        }

        //switch case
        int diaDaSemana = 2;
        switch (diaDaSemana){
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
