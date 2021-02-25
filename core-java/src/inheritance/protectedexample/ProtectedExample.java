package inheritance.protectedexample;

public class ProtectedExample {
    public void callPublic(){

    }

    private void callPrivate(){
        callProtected();
    }

    protected void callProtected(){

    }

    public static void main(String[] args) {
        ProtectedExample pe = new ProtectedExample();
        pe.callProtected();
        pe.callPrivate();
        pe.callPublic();
    }
}

