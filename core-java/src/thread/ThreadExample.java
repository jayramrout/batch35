package thread;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Name of Thread :"+ Thread.currentThread().getName());

        Horse horse = new Horse("Cheeta");
//        horse.setName("Cheeta");
        horse.start();

        System.out.println(System.lineSeparator());

        Horse horse2 = new Horse("Sakaa");
        horse2.start();

        Horse horse3 = new Horse("Meeta");
        horse3.start();

        System.out.println("I am done...");
    }

}

