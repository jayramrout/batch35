package inheritance.protectedexample;

public class DriverProtectedExample {
    public static void main(String[] args) {
        ProtectedExample pe = new ProtectedExample();
        pe.callProtected();
        pe.callPublic();
    }
}

