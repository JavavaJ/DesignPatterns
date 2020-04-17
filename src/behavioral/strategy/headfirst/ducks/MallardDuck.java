package behavioral.strategy.headfirst.ducks;

import behavioral.strategy.headfirst.flyables.FlyWithWings;
import behavioral.strategy.headfirst.quackables.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
}
