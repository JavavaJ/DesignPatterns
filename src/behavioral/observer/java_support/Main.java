package behavioral.observer.java_support;

public class Main {

    public static void main(String[] args) {
        Observer observer = new Observer();
        Publisher publisher = new Publisher();
        publisher.registerObserver(observer);

        publisher.setValue("Yo!");
        publisher.setValue("Hello Value!");
    }

}
