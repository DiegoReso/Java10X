package ThreadExecucao;

public class TesteThread extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Runnable : " + i);
        }
    }

}
