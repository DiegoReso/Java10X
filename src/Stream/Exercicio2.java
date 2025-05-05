package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio2 {
    public static void main(String[] args) {


        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Diego", "diego@email", 500.0));
        list.add(new Employee("Roskana", "roskana@email", 1000.0));
        list.add(new Employee("Cailania", "cailania@email", 10000.0));
        list.add(new Employee("Camaro", "acamaro@email", 6000.0));
        list.add(new Employee("Maria de Lourdes", "marialurde@email", 5000.0));
        list.add(new Employee("Maria da Conceicao", "mariaconcei@email", 6000.0));

        Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());


        System.out.println(" Email ordem alfabetica com salario maior que 1000.0 " + Arrays.toString(list.stream()
                .filter(x -> x.getSalary() > 1000.0)
                .map(x -> x.getEmail())
                .sorted(comp)
                .toArray()

        ));

        System.out.println("Soma salarios dos funcionarios com nome comeco M " + list.stream()
                .filter(x -> x.getName().charAt(0) == 'M')
                .map(x -> x.getSalary())
                .reduce(0.0,(x,y) -> x + y)
        );

    }
}
