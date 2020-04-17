package behavioral.observer.for_dummies;

public class Boss implements Observer {

//    private Subject subject;
//
//    public Boss(Subject subject) {
//        this.subject = subject;
//        subject.registerObserver(this);
//    }


    public Boss() {
    }

    @Override
    public void update(String operation, String record) {
        System.out.println("Operation: " + operation +
            "; record: " + record + " FROM BOSS");

    }
}
