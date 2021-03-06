package thread;

public class RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Dog dog = new Dog(); // Runnable
        Thread thread = new Thread(dog,"Peet");
        thread.start();
        System.out.println("I am done "+ Thread.currentThread().getName());
    }

}

