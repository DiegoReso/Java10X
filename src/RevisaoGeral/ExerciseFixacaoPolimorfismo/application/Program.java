package RevisaoGeral.ExerciseFixacaoPolimorfismo.application;

import RevisaoGeral.ExerciseFixacaoPolimorfismo.entities.ImportedProduct;
import RevisaoGeral.ExerciseFixacaoPolimorfismo.entities.Produto;
import RevisaoGeral.ExerciseFixacaoPolimorfismo.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Produto> productsList =  new ArrayList<>();

        System.out.print("Enter the number of products");
        int quantityItem = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= quantityItem ; i++) {
            System.out.println("Product # " + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(productType == 'c'){
                productsList.add(new Produto(name, price));
            }else if(productType == 'i'){
                System.out.print("Custom fee: ");
                double fee = sc.nextDouble();
                productsList.add(new ImportedProduct(name,price,fee));
            }else{
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();
                Date dateParse = sdf.parse(date);
                productsList.add(new UsedProduct(name,price, dateParse));
            }

        }

        System.out.println("Price Tags:");
        for (Produto product : productsList){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
