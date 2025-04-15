package ThreadExecucao.SyncronizedThread;

public class Main {
    public static void main(String[] args) {
        Armazena armazena = new Armazena();

        Thread thread1 = new Thread(new ExecutandoTarefas(armazena));
        thread1.start();

        Thread thread2 = new Thread(new ExecutandoTarefas(armazena));
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(armazena.i);
    }
}
