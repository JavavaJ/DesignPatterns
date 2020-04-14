package decorator.headfirst;

import decorator.headfirst.coffees.DarkRoast;
import decorator.headfirst.coffees.Espresso;
import decorator.headfirst.coffees.HouseBlend;
import decorator.headfirst.condiments.Mocha;
import decorator.headfirst.condiments.Soy;
import decorator.headfirst.condiments.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() +
            " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());


    }

}
