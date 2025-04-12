package Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> listaDeNomes = new ArrayList<>();//melhor para consultas por indices
        listaDeNomes.add("Diego");
        listaDeNomes.add("Jao");
        listaDeNomes.add("Iatazaki");

        //resgar primeiro nome
        System.out.println("===========================");
        System.out.println("Resgatando primeiro elemento da List");

        System.out.println(listaDeNomes.get(0));
        System.out.println("===========================");

        System.out.println("Alterando segundo elemento da List");
        listaDeNomes.set(1,"Jao alterado");
        System.out.println(listaDeNomes.get(1));
        System.out.println("===========================");

        System.out.println("Removendo terceiro elemento da List");
        listaDeNomes.remove(2);
        System.out.println(listaDeNomes);

        System.out.println("===========================");
        System.out.println("Verificar se contem o que busco em algum elemento");
        System.out.println(listaDeNomes.contains("Diego"));

        System.out.println("===========================");
        System.out.println("Linked List");

        List<Integer> listaDeNumeros = new LinkedList<>();//ordem de inclusao melhor para alteracoes

        for (int i = 1; i <= 5; i++) {
            listaDeNumeros.add(i);
        }

        System.out.println(listaDeNumeros);
        System.out.println("===========================");
        System.out.println("HashSet");
        Set<String> conjunto = new HashSet<>();//ordem aleatoria sem duplicidade de valores
        conjunto.add("HashSet Lista");
        conjunto.add("Estudando Hash");
        conjunto.add("Abraco do urso");
        conjunto.add("Abraco do urso"); //nao adiciona, pois Set nao aceita elemento duplicado
        System.out.println(conjunto);

        System.out.println("===========================");
        System.out.println("Linked HashSet");
        Set<Integer> numeros = new LinkedHashSet<>(); //nao aceita elementos duplicados e organiza na ordem de inclusao
        numeros.add(1);
        numeros.add(25);
        numeros.add(10);
        numeros.add(5);
        numeros.add(5);//nao aceita elementos duplicados
        System.out.println(numeros);

        System.out.println("===========================");
        System.out.println("Tree Set");
        Set<String> nomesTree = new TreeSet<>(); //nao aceita elemento duplicado e organiza a lista conforme o tipo
        //se for string vai ser em ordem alfabetica, se for numero em ordem numerica
        nomesTree.add("Diego");
        nomesTree.add("Roskana");
        nomesTree.add("Cailania");
        nomesTree.add("Cailania");
        System.out.println(nomesTree);


        System.out.println("===========================");
        System.out.println("HASHMAP");
        Map<String, Integer> idMap = new HashMap<>();
        idMap.put("Diego", 34);
        idMap.put("Cailania", 31);
        idMap.put("Roskana", 32);
        idMap.put("Camaro", 23);
        System.out.println("Ordena por ordem da Chave "+ idMap);

        //para saber idade de um elemento, exemplo
        System.out.println("Idade elemento Diego : " + idMap.get("Diego"));

        //removendo Roskana
        idMap.remove("Roskana");
        System.out.println(idMap);

        //verificando se contem key ou value
        System.out.println(idMap.containsKey("Cailania"));
        System.out.println(idMap.containsValue(34));
        System.out.println(idMap.containsValue(99));

        //exibindo chaves e valores
        System.out.println(idMap.entrySet());

        System.out.println("===========================");
        System.out.println("LINKED HASHMAP");

        Map<String, Integer> mapLinked = new LinkedHashMap<>();//ordena ordem de insercao
        mapLinked.put("DIego", 1);
        mapLinked.put("CAilania", 20);
        mapLinked.put("Roskana", 321);
        System.out.println(mapLinked);

        System.out.println("===========================");
        System.out.println("TREEMAP");//ordena pela ordem da chave, que no caso eh numero

        Map<Number,String> mapTree = new TreeMap<>();
        mapTree.put(10,"Casa");
        mapTree.put(1, "Motor Home");
        mapTree.put(3,"Banco");

        System.out.println(mapTree);

        Map<String, Number> mapTreeString = new TreeMap<>();//ordenando pela chave, que no caso eh string
        mapTreeString.put("Rj", 1);
        mapTreeString.put("SP",3);
        mapTreeString.put("AB", 2);
        System.out.println(mapTreeString);

    }
}
