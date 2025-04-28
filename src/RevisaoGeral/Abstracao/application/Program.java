package RevisaoGeral.Abstracao.application;


import RevisaoGeral.Abstracao.entities.Circle;
import RevisaoGeral.Abstracao.entities.Rectangle;
import RevisaoGeral.Abstracao.entities.Shape;
import RevisaoGeral.Abstracao.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> listShape = new ArrayList<>();
        System.out.print("Enter the number of Shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n ; i++) {
            System.out.print("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)?");
            char shape = sc.next().charAt(0);
            sc.nextLine();

            if(shape == 'r'){
                System.out.print("Color (BLACK/BLUE/RED): ");
                String color = sc.nextLine();
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                listShape.add(new Rectangle(Color.valueOf(color), width, height));
            }else{
                System.out.print("Color (BLACK/BLUE/RED): ");
                String color = sc.nextLine();
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                listShape.add(new Circle(Color.valueOf(color), radius));
            }
        }

        System.out.println("Shape areas");

        for (Shape shape : listShape){
            System.out.printf("%.2f%n",shape.area());
        }

        sc.close();
    }
}
