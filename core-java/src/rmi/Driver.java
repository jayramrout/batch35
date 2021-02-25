package rmi;

public class Driver {
    public static void main(String[] args) throws Exception {
        IFetchNames fetchNames = new FetchNamesImpl();
        String fullName = fetchNames.fetchFullName("Tara");
        System.out.println(fullName);
    }
}
