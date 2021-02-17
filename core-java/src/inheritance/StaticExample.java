package inheritance;

class Mouse {
    public String model;
    public static int count = 0;
    public Mouse(String model){
        this.model = model;
        count = count +1;
    }

}

public class StaticExample {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Logitec");
        mouse.model = "LOGI";
//        System.out.println(mouse.count);

        Mouse mouse1 = new Mouse("Apple");
//        System.out.println(mouse1.count);

        Mouse mouse2 = new Mouse("HP");
//        System.out.println(mouse2.count);

        System.out.println(Mouse.count);

        mouse2.count = 100;

        System.out.println(mouse1.count);

        int max = Math.max(23, 90);

    }


}

