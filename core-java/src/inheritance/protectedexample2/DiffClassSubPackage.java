package inheritance.protectedexample2;

import inheritance.protectedexample.ProtectedExample;

public class DiffClassSubPackage extends ProtectedExample{

    public void callProtected(){
        super.callProtected();
    }

    public static void main(String[] args) {
        ProtectedExample pe = new ProtectedExample();
        pe.callPublic();
    }
}
