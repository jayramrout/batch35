package inheritance.protectedexample;

public class SubClass extends ProtectedExample {
    public void subClassFunction(){
        callProtected();
        callPublic();
    }
}
