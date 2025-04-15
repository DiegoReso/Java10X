package ThreadExecucao;

public class Main {

    public static void main(String[] args) {
        TesteThread t1 = new TesteThread();
        t1.start();

        TesteThread t2 = new TesteThread();
        t2.start();


        Thread t1Runnable = new Thread(new ThreadComRunnable());
        Thread t2Runnable = new Thread(new ThreadComRunnable());

        t1Runnable.start();
        t2Runnable.start();


        Thread t3RunnableLambda = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " Runnable Lambda t3 : " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t4RunnableLambda = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " Runnable Lambda t4 : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t3RunnableLambda.start();
        t4RunnableLambda.start();

    }
}
