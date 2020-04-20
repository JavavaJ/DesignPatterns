package behavioral.mediator.derek;

public class JTPoorman extends Colleague {
    public JTPoorman(Mediator mediator) {
        super(mediator);
        System.out.println("JTPoorman " +
            "signed up with the exchange");
    }
}
