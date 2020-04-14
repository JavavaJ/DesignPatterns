package strategy.headfirst.quackables;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No sound!");
    }
}
