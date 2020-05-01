package creational.singleton.for_dummies;

public class Worker implements Runnable {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Database database = Database.getInstance(name);
        System.out.println("This is " + database.getName() + " database.");
    }
}