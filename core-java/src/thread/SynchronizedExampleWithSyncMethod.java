package thread;

public class SynchronizedExampleWithSyncMethod {
    public static void main(String[] args) {
        HelperThread_2 helperThread = new HelperThread_2();
        Thread t1 = new Thread(new CallerThread_2(helperThread,"api1"), "ONE");
        Thread t2 = new Thread(new CallerThread_2(helperThread,"api2"),"TWO");

        t1.start();
        t2.start();

    }
}

class CallerThread_2 implements Runnable {
    private HelperThread_2 helperThread;
    private String api;

    public CallerThread_2(HelperThread_2 helperThread, String api) {
        this.helperThread = helperThread;
        this.api = api;
    }

    @Override
    public void run() {
        if (api.equals("api1")) {
            helperThread.api1();
        } else {
            helperThread.api2();
        }
    }
}

class HelperThread_2 {

    public synchronized void api1() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " api1 " + i);
        }
    }

    public synchronized void api2() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " api1 " + i);

        }
    }
}
