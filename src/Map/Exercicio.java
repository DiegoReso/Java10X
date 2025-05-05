package Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Exercicio {
    public static void main(String[] args) {

        try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\diego\\Documents\\workspace\\vot.txt"))){

            Map<String, Integer> vot = new HashMap<>();

            String line = bf.readLine();

            while(line != null){
                String[] words = line.split(",");
                String name = words[0];
                Integer votes = Integer.parseInt(words[1]);

                if(!vot.containsKey(name)){
                    vot.put(name,votes);
                }else{
                    Integer somar = vot.get(name);
                    vot.put(name, (votes + somar));
                }

                line = bf.readLine();

            }

            for (String key : vot.keySet()){
                System.out.println(key + ": " + vot.get(key));
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
