package RevisaoGeral;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Matrizes

        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = j + 1 ;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }

        //Rent Room
        System.out.println("Quantos quartos serao alugador?");
        int quantidadeQuartos = scanner.nextInt();


        Client[] clientes = new Client[10];

        for (int i = 0; i < quantidadeQuartos; i++) {
            System.out.println("Entre com o quarto a ser alugado para instaciar o objeto");
            int quarto = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Entre com o nome e depois email do estudante");
            String name = scanner.nextLine();
            String email = scanner.nextLine();
            clientes[quarto] = new Client(name, email);
            System.out.println(clientes[quarto]);
        }

        System.out.println("++++++++++++++++");
        for (Client client : clientes){
            System.out.println(client);
        }


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
