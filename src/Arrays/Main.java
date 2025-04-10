package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Minato");
        ninjas.add("Kakashi");

        System.out.println("Ninjas Lista: " + ninjas);
        ninjas.remove("Kakashi");
        System.out.println("Ninjas Lista: " + ninjas);

        ninjas.set(0, "Naruto Rei delas");
        System.out.println("Ninjas Lista: " + ninjas);
        System.out.println(ninjas.size());


    }
}
