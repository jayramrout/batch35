package thread;

public class SynchronizedExampleWithSyncBlock {
    public static void main(String[] args) {
        HelperThread helperThread = new HelperThread();
        Thread t1 = new Thread(new CallerThread(helperThread,"api1"), "ONE");
        Thread t2 = new Thread(new CallerThread(helperThread,"api2"),"TWO");

        t1.start();
        t2.start();
    }
}

class CallerThread implements Runnable {
    private HelperThread helperThread;
    private String api;
    public CallerThread(HelperThread helperThread , String api) {
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

class HelperThread {

    private Object object1 = new Object();
    private Object object2 = new Object();

    public void api1() {
        synchronized (object1) {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" api1 "+i);
            }
        }
    }

    public void api2() {
        synchronized (object2) {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" api1 "+i);

            }
        }
    }
}
