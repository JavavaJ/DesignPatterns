package behavioral.mediator.derek;

public class GormanSlacks extends Colleague {
    public GormanSlacks(Mediator mediator) {
        super(mediator);
        System.out.println("Gorman Slacks " +
            "signed up with the exchange");
    }
}
