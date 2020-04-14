package strategy.headfirst;

import strategy.headfirst.ducks.Duck;
import strategy.headfirst.ducks.MallardDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }

}
