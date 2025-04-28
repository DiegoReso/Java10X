package RevisaoGeral.exerciseFixacao;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============Order System===================");
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String birthDate = sc.next();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.next().toUpperCase();

        Client client = new Client(name, email, new Date(birthDate));

        Order order = new Order(new Date(),OrdersStatus.valueOf(status),client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            String nameItem = sc.nextLine();
            System.out.print("Product price: ");
            double priceItem = sc.nextDouble();
            System.out.print("Quantity: ");
            int qtItem = sc.nextInt();
            sc.nextLine();

            order.addItem(new OrderItem(qtItem, new Product(nameItem, priceItem)));

        }
        System.out.println("=============================");
        System.out.println(order);

        sc.close();
    }
}
