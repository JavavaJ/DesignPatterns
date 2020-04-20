package behavioral.state.head_first.state;

import behavioral.state.head_first.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State {
    private Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You already inserted a quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned the crank.");
        int winner = randomWinner.nextInt(10);
        System.out.println("Win num: " + winner);
        if ((winner == 0) && (gumballMachine.getGumballCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }

    @Override
    public String toString() {
        return "HasQuarterState{}";
    }
}
