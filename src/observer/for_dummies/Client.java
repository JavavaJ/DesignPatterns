package observer.for_dummies;

public class Client implements Observer {

    public Client() {
    }

    @Override
    public void update(String operation, String record) {
        System.out.println("Operation: " + operation +
            "; record: " + record + " FROM CLIENT");
    }
}
