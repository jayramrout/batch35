package thread;

import java.sql.Time;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        PrinterResource pr = new PrinterResource();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Thread computer1 = new Thread(pr,"Peter");
        Thread computer2 = new Thread(pr,"Pan");
        executorService.submit(computer1);
        executorService.submit(computer2);
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(1,TimeUnit.DAYS)){
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am done");

    }
}
