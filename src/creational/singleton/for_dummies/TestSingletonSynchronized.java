package creational.singleton.for_dummies;

public class TestSingletonSynchronized implements Runnable {
    Thread thread;

    public static void main(String[] args) {
        TestSingletonSynchronized testSingletonSynchronized = new TestSingletonSynchronized();
    }

    public TestSingletonSynchronized() {
        Database database;
        database = Database.getInstance("products");

        thread = new Thread(this, "second");
        thread.start();

        System.out.println("This is " + database.getName() + " database.");
    }

    @Override
    public void run() {
        Database database = Database.getInstance("employees");
        System.out.println("This is " + database.getName() + " database.");
    }
}
