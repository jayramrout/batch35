package thread;

import org.w3c.dom.ls.LSOutput;

public class ResourceExample {
    public static void main(String[] args) {
        PrinterResource pr = new PrinterResource();
        // new --> New
        // start() --> Runnable

        /*Thread computer1 = new Thread(pr,"Peter");
        computer1.start();

        Thread computer2 = new Thread(pr,"Pan");
        computer2.start();
        computer2.setPriority(Thread.MAX_PRIORITY);
*/
        Thread computer3 = new Thread(pr,"Julie");
        computer3.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        computer3.start(); // IllegalThreadStateException

//        Runnable r1 = () -> System.out.println("Hello there");
        /*Thread t1 = new Thread(() -> System.out.println("Hello there"));
        t1.start();   */
    }
}
