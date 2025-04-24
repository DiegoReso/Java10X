package RevisaoGeral;

import java.util.Scanner;

public class EstaticJava {

    static final double PI = 3.14159;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        scanner.close();
    }

//usando metodos estaticos para uma classe estatica que no caso eh a main
//    static double circumference(double radius){
//        return 2.0 * PI * radius;
//    }
//
//    static double volume(double radius){
//        return 4.0 * PI * radius * radius * radius / 3.0;
//    }
}
