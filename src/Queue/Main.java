package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Shikamaru");
        System.out.println("Mostrando a fila: " + ninjasQueue);

        ninjasQueue.poll();
        System.out.println("Mostrando a fila: " + ninjasQueue);

        System.out.println(ninjasQueue.peek());

        ninjasQueue.add("Tobirama");
        System.out.println("Mostrando a fila: " + ninjasQueue);

    }
}
