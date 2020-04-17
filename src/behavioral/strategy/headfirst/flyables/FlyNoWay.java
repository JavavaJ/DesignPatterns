package behavioral.strategy.headfirst.flyables;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("No flying.");
    }
}
