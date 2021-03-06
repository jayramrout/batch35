package thread;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class Processor implements Runnable{
    private CountDownLatch latch;

    public Processor(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println("Started.");

        IntStream.range(0,5).forEach(obj -> {
            System.out.println(obj );
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        latch.countDown();
    }
}
