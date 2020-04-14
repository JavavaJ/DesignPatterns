package observer.for_dummies;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();

        Archive archive = new Archive();
        Client client = new Client();
        Boss boss = new Boss();

        List<Observer> observers = Arrays.asList(archive, client, boss);
        observers.forEach(observer -> database.registerObserver(observer));

        database.removeObserver(boss);

        database.editRecord("delete", "record 1");
    }

}
