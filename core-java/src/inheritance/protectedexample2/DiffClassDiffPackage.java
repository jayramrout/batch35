package inheritance.protectedexample2;

import inheritance.protectedexample.ProtectedExample;

public class DiffClassDiffPackage {

    public static void main(String[] args) {
        ProtectedExample pe = new ProtectedExample();
        pe.callPublic();
    }
}
