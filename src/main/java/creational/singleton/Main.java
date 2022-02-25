package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1.equals(obj2));

        BillPughSingleton bpObj1 = BillPughSingleton.getInstance();
        BillPughSingleton bpObj2 = BillPughSingleton.getInstance();
        System.out.println(bpObj1.equals(bpObj2));

    }
}
