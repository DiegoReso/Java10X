package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Dirgio", "m4es", "Cailania");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0,x -> x +2).limit(10);
        System.out.println(Arrays.toString(st3.toArray()));

        int sum = list.stream().reduce(0, (x,y) -> x +y);
        System.out.println("Soma" + sum);

        List<Integer> newList = list.stream()
                .filter( x -> x % 2 == 0)
                .map(x -> x *10)
                .toList();

        System.out.println(Arrays.toString(newList.toArray()));

    }
}
