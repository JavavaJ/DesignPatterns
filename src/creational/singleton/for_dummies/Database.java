package creational.singleton.for_dummies;

public class Database {
    private static Database database;
    private int record;
    private String name;

    private Database(String name) {
        this.name = name;
        this.record = 0;
    }

    public static Database getInstance(String name) {
        if (database == null) {
           synchronized (Database.class) {
               if (database == null) {
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   database = new Database(name);
               }
           }
        }
        return database;
    }

    public void editRecord(String operation) {
        System.out.println("Performing a " + operation);
    }

    public String getName() {
        return name;
    }
}
