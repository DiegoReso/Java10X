package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        //map com obnjeto
        Map<Produto,Double> products = new HashMap<>();

        Produto p1 = new Produto("TV", 900.0);
        Produto p2 = new Produto("Notebook", 1200.0);
        Produto p3 = new Produto("Tablet", 400.0);

        products.put(p1, 10000.0);
        products.put(p2, 20000.0);
        products.put(p3, 15000.0);

        Produto p4 = new Produto("Notebook", 1200.0);
        System.out.println("Produto contem 'p4'? -> " + products.containsKey(p4));

        System.out.println();
        Map<String,String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "email@email.com");
        cookies.put("phone", "987962465");

        cookies.remove("email");
        System.out.println(cookies.get("username"));
        System.out.println(cookies.keySet());

        cookies.put("phone", "133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Size cookies: " + cookies.size());

        System.out.println("ALL");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
