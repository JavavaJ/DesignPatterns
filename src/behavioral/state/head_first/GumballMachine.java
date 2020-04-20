package behavioral.state.head_first;

import behavioral.state.head_first.state.*;

public class GumballMachine {

    private State hasQuarterState;
    private State noQuarterState;
    private State soldOutState;
    private State soldState;
    private State winnerState;

    State state = soldOutState;
    int gumballCount = 0;

    public GumballMachine(int gumballCount) {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.gumballCount = gumballCount;
        if (gumballCount > 0) {
            state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if (gumballCount != 0) {
            gumballCount--;
        }
    }

    public void refill(int gumballNum) {
        this.gumballCount = gumballNum;
        System.out.println("Machine is being refilled...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        state = noQuarterState;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
            "state=" + state +
            ", gumballCount=" + gumballCount +
            '}';
    }
}
