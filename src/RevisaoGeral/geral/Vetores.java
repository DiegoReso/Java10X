package RevisaoGeral.geral;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //matriz pegando valores a esquerda direita e acima

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int numeroEscolhido = 11;
        mostrarVizinhos(matriz, numeroEscolhido);


        //Matrizes
        int[][] matriz1 = new int[2][3];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {

                matriz1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matriz1.length; i++) {

                System.out.println(matriz1[i][i]);
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if(matriz[i][j] < 0){
                    System.out.println(" Numero negativo na matriz "+ matriz[i][j]);
                }
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

        scanner.close();
    }

    public static void mostrarVizinhos(int[][] matriz, int numero) {
        boolean encontrado = false;

        // Percorre a matriz para encontrar o número
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    encontrado = true;
                    System.out.println("Número " + numero + " encontrado na posição [" + i + "][" + j + "]");
                    System.out.println("Vizinhos:");

                    // Vizinho acima
                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }

                    // Vizinho abaixo
                    if (i < matriz.length - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }

                    // Vizinho à esquerda
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }

                    // Vizinho à direita
                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                }
            }
        }
    }
}
