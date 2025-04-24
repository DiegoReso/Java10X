package RevisaoGeral;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        //ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2, 65);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.remove(0);
        System.out.println(list);
        list.removeIf(x ->  x.equals(5));
        System.out.println(list);

        System.out.println("===================");

        List<String> listNames = new ArrayList<>();
        listNames.add("Craudia");
        listNames.add("Arroba de Prantos");
        listNames.add("Cailebs");
        listNames.add("Antonieta");
        listNames.add("Cailebs");


        List<String> result = listNames.stream()
                .filter(x -> x.charAt(0) == 'A')
                .collect(Collectors.toList());

        System.out.println(result);

        String name = listNames.stream()
                .filter(x -> x.charAt(0) == 'C')
                .findFirst().orElse(null);

        System.out.println(name);
    }
}
