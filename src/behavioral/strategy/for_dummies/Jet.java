package behavioral.strategy.for_dummies;

public class Jet extends Vehicle {

    public Jet() {
        setGoAlgorithm(new Jetting());
    }
}
