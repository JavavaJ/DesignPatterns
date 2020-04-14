package strategy.headfirst.ducks;

import strategy.headfirst.flyables.FlyWithWings;
import strategy.headfirst.quackables.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
}
