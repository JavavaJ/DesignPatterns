package behavioral.state.head_first.state;

import behavioral.state.head_first.GumballMachine;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, we have sold out all the gumballs.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, we have sold out all the gumballs.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, we have sold out all the gumballs.");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, we have sold out all the gumballs.");
    }

    @Override
    public String toString() {
        return "SoldOutState{}";
    }
}
