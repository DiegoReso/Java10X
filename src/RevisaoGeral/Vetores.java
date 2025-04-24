package RevisaoGeral;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o tamanho do vetor de objeto");
        int n1 = scanner.nextInt();

        ProductVect[] produtos = new ProductVect[n1];

        for (int i = 0; i < produtos.length; i++) {
            scanner.nextLine();
            System.out.println("Entre com o nome do " + (i+1) + "  produto!");
            String name = scanner.nextLine();

            System.out.println("Entre com o preco do " + (i+1) + " produto!");
            double price = scanner.nextDouble();
            produtos[i] = new ProductVect(name,price);
        }

        for (ProductVect produto : produtos){
            System.out.println(produto);
        }

        System.out.println("Entre com o tamanho do vetor");
        int n = scanner.nextInt();
        double[] numerosDouble = new double[n];
        double sum = 0.0;

        for (int i = 0; i < numerosDouble.length; i++) {
            System.out.println("Entre com o numero do elemento");
            numerosDouble[i] = scanner.nextDouble();
            sum +=numerosDouble[i];
        }

        double avg = sum / numerosDouble.length;

        System.out.println(" a media dos numeros dentro do vetor eh: " + avg);

        for (double numero : numerosDouble) {
            System.out.println(numero);
        }
    }
}
