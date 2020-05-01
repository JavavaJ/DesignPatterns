package creational.singleton.for_dummies;

public class TestSingleton {

    public static void main(String[] args) {
        Database database;
        database = Database.getInstance("products");
        System.out.println("This is " + database.getName() + " database.");

        database = Database.getInstance("employees");
        System.out.println("This is " + database.getName() + " database.");
    }
}
