package thread;

public class Dog extends Animal implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(" Running ..."+ i +" Miles " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}