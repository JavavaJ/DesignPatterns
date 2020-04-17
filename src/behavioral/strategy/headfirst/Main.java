package behavioral.strategy.headfirst;

import behavioral.strategy.headfirst.ducks.Duck;
import behavioral.strategy.headfirst.ducks.MallardDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }

}
