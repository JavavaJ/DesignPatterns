package behavioral.mediator.for_dummies;

public class ExitPage {

    private Mediator mediator;

    public ExitPage(Mediator mediator) {
        this.mediator = mediator;
    }

    public void go() {
        System.out.println("Please come again.");
    }
}
