package thread;

// Animals
public class Horse extends Thread {
//    private final String name;

    public Horse(String name){
//        this.name = name;
        super.setName(name);
    }

    @Override
    public void run() {
        startRunning();
    }


    private void startRunning(){
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