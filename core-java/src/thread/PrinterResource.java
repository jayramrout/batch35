package thread;

public class PrinterResource implements Runnable {
    @Override
    public void run() { // synchronized method or block...
        synchronized (this){
            for (int i = 0 ; i < 5; i ++){

                System.out.println("I have started printing "+i+" for " +
                        Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}