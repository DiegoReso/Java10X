package SetList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        //exercicio proposto
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            b.add(number);
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            c.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();


        System.out.println();
        System.out.println();

        //ler arquivo e pegar usuarion e login
        try(BufferedReader br =  new BufferedReader(new FileReader("C:\\Users\\diego\\Documents\\workspace\\log.txt"))){

            DateTimeFormatter formatoData = DateTimeFormatter.ISO_INSTANT
                    .withZone(ZoneId.systemDefault());
            String linha = br.readLine();
            Set<LogEntry> listLog = new HashSet<>();

            while(linha != null){
                String[] content = linha.split(" ");
                LocalDateTime dataHora = LocalDateTime.parse(content[1], DateTimeFormatter.ISO_DATE_TIME);
                listLog.add(new LogEntry(content[0], dataHora));
                linha = br.readLine();
            }

            for (LogEntry log : listLog){
                System.out.println(log);
            }
            System.out.println("Total " + listLog.size());



        }catch (IOException e){
            System.out.println(e.getMessage());
        }



        Set<Integer> a1 = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
        Set<Integer> b1 = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c1 = new TreeSet<>(a1);
        c1.addAll(b1);
        System.out.println(c1);

        //intersection
        Set<Integer> d = new TreeSet<>(a1);
        d.retainAll(b1);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a1);
        e.removeAll(b1);
        System.out.println(e);


        //set produto comparando propduto
        Set<Produto> set = new HashSet<>();
        set.add(new Produto("TV", 900.0));
        set.add(new Produto("Notebook", 1200.0));
        set.add(new Produto("Tablet", 400.0));

        Set<Produto> tree = new TreeSet<>();
        tree.add(new Produto("TV", 900.0));
        tree.add(new Produto("Notebook", 1200.0));
        tree.add(new Produto("Tablet", 400.0));

        Produto prod = new Produto("Notebook", 1200.0);

        System.out.println(set.contains(prod));

        set.removeIf(x -> x.getName() == "TV");

        for (Produto p : set){
            System.out.println(p);
        }

        tree.removeIf(x -> x.getName() == "Tablet");

        System.out.println();
        for (Produto p : tree){
            System.out.println(p);
        }
    }
}
