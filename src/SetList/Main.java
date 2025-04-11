package SetList;


import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Elementos nao irao se repetir se forem iguals e sem ordenacao por index
        Set<String> ninjaSet = new HashSet<>();
        ninjaSet.add("Naruto");
        ninjaSet.add("Sasuke");
        ninjaSet.add("Minato");
        ninjaSet.add("Naruto");
        ninjaSet.add("Boruto");
        ninjaSet.add("Gaara");
        System.out.println(ninjaSet);

        System.out.println("********excluindo Sasuke*********");
        ninjaSet.remove("Sasuke");
        System.out.println(ninjaSet);
        System.out.println("********excluindo Sasuke*********");

        System.out.println("**********Ninja Tree SET************");
        Set<String> ninjaTreeSet = new TreeSet<>();
        ninjaTreeSet.addAll(ninjaSet);
        System.out.println(ninjaTreeSet);
        System.out.println("**********Ninja Tree SET************");

    }
}
