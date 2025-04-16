package RevisaoGeral;

import javax.xml.namespace.QName;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade!");
        int idade = sc.nextInt();
        System.out.println("A idade eh: " + idade);

        System.out.println("Digite o preco da sua hora de dev!");
        double preco = sc.nextDouble();
        System.out.println("Seu preco eh: " + preco);

        System.out.println("Pegarei a primeira letra do que vc digitar");
        char letra = sc.next().charAt(0);
        System.out.println("Primeira letra da plavra digitada foi..." + letra);

        String s1,s2,s3;
        sc.nextLine(); //consumindo quebra de linha pendente
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Valores digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //casting dados
        int a,b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b; //necessario casting explicito
        System.out.println(resultado);

        String product1 = "Computador";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products\n" +
                "%s, wich price is $ %f\n" +
                "%s, wich price is $ %.2f\n" +
                "\n" +
                "Record: %d years old, code %d and gender: %s\n" +
                "\n" +
                "Measue with eight decimal places: %f\n" +
                "Rouded (three decimal places): %.3f\n", product1, price1, product2,price2, age, code, gender, measure,measure);
        System.out.printf("US decimal pont: %.3f", measure);

        sc.close();

    }
}
