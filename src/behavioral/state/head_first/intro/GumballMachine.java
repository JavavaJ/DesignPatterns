package behavioral.state.head_first.intro;

public class GumballMachine {

    public final static int SOLD_OUT = 0;
    public final static int NO_QUARTER = 1;
    public final static int HAS_QUARTER = 2;
    public final static int SOLD = 3;

    int state = SOLD_OUT;
    int gumballCount = 0;

    public GumballMachine(int gumballCount) {
        this.gumballCount = gumballCount;
        if (gumballCount > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("You can't insert another quarter.");
                break;
            case NO_QUARTER:
                state = HAS_QUARTER;
                System.out.println("You inserted a quarter.");
                break;
            case SOLD_OUT:
                System.out.println("You can't insert another quarter, the machine is sold out.");
                break;
            case SOLD:
                System.out.println("Please wait, we're already giving you a gumball.");
                break;
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("Quarter returned.");
                state = NO_QUARTER;
                break;
            case NO_QUARTER:
                System.out.println("You haven't inserted a quarter.");
                break;
            case SOLD_OUT:
                System.out.println("You can't eject, you haven't inserted a quarter yet.");
                break;
            case SOLD:
                System.out.println("Sorry, you already turned the crank.");
                break;
        }
    }

    public void turnCrank() {
        switch (state) {
            case SOLD:
                System.out.println("Turning twice doesn't get you another gumball!");
                break;
            case NO_QUARTER:
                System.out.println("You turned but there is no quarter.");
                break;
            case SOLD_OUT:
                System.out.println("You turned but there are no gumballs.");
                break;
            case HAS_QUARTER:
                System.out.println("You turned...");
                state = SOLD;
                dispense();
                break;
        }
    }

    public void dispense() {
        switch (state) {
            case SOLD:
                System.out.println("A gumball comes rolling out the slot.");
                gumballCount--;
                if (gumballCount == 0) {
                    System.out.println("Oops, out of gumballs!");
                    state = SOLD_OUT;
                } else {
                    state = NO_QUARTER;
                }
                break;
            case NO_QUARTER:
                System.out.println("You need to pay first.");
                break;
            case SOLD_OUT:
                System.out.println("No gumball dispensed.");
                break;
            case HAS_QUARTER:
                System.out.println("No gumball dispensed.");
                break;
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
            "state=" + state +
            ", gumballCount=" + gumballCount +
            '}';
    }
}
