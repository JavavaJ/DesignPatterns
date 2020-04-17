package behavioral.observer.for_dummies;

public class Archive implements Observer {

    public Archive() {
    }

    @Override
    public void update(String operation, String record) {
        System.out.println("Operation: " + operation +
            "; record: " + record + " FROM ARCHIVE");
    }
}
