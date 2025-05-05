package SetList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
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


        }catch (IOException e){
            System.out.println(e.getMessage());
        }



        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
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

        for (Produto p : set){
            System.out.println(p);
        }
        System.out.println();
        for (Produto p : tree){
            System.out.println(p);
        }


    }
}
