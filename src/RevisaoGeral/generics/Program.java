package RevisaoGeral.generics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {

        //wildcard

        List<Integer> myInts = Arrays.asList(5,2,10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Dui" , "Reso" , "Souza");
        printList(myStrs);


        //generico demilitado
        List<Produto> prod = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\diego\\Documents\\workspace\\out.txt"))){

            String linha = bf.readLine();

            while(linha != null){
                String[] split = linha.split(",");
                prod.add(new Produto(split[0], Double.parseDouble(split[1])));
                linha = bf.readLine();
            }

            Produto x = CalculationService.max(prod);
            System.out.println("Max");
            System.out.println(x);


        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        PrintService<String> listaString = new PrintService<>();
        listaString.addValue("Teste String");
        listaString.addValue("String");
        listaString.addValue("Stringando");

        PrintService<Integer> listaInteiros = new PrintService<>();
        listaInteiros.addValue(1);
        listaInteiros.addValue(80);
        listaInteiros.addValue(30);

        System.out.println(listaString.first());
        listaString.print();

        System.out.println(listaInteiros.first());
        listaInteiros.print();

    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
