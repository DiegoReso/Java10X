package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Armario", 500.00));
        list.add(new Produto("Notebook", 1200.00));
        list.add(new Produto("Tablet", 50.00));
        list.add(new Produto("Tampa", 1000.00));

        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Produto p : list){
            System.out.println(p);
        }

        System.out.println();
        System.out.println();

        list.removeIf(x -> x.getPrice() < 100.0);

        for (Produto p : list){
            System.out.println(p);
        }

        System.out.println();
        System.out.println();

        list.forEach(x -> x.setPrice(x.getPrice() + x.getPrice() * 0.1) );

        for (Produto p : list){
            System.out.println(p);
        }

        System.out.println();
        System.out.println("forEach");

        list.forEach(x -> System.out.println(x));

        System.out.println();
        System.out.println();

        //Function com map

        List<String> names = list.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(x -> System.out.println(x));

        //Funcao propria com predicado

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, x -> x.getName().charAt(0) == 'N');
        System.out.println(sum);
    }
}
