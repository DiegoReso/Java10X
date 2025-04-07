package NivelBasico.TiposDeDados.Condicoes;

import java.util.Scanner;

public class ScannerUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o nome do ninja");
        String name = scanner.nextLine();

        System.out.println("Entre com a idade do ninja");
        int age = scanner.nextInt();

        System.out.println("Nome do ninja: " + name + " e idade: " + age + "!");

        scanner.close();
    }
}
