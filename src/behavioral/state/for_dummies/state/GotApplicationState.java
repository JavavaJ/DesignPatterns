package behavioral.state.for_dummies.state;

import behavioral.state.for_dummies.IAutomat;

import java.util.Random;

public class GotApplicationState implements State {
    private IAutomat automat;
    private Random random;

    public GotApplicationState(IAutomat automat) {
        this.automat = automat;
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public String gotApplication() {
        return "We already got your application.";
    }

    @Override
    public String checkApplication() {
        int yesNo = random.nextInt() % 10;

        if (yesNo > 4 && automat.getCount() > 0) {
            automat.setState(automat.getApartmentRentedState());
            return "Congratulations, you were approved.";
        } else {
            automat.setState(automat.getWaitingState());
            return "Sorry, you were not approved.";
        }
    }

    @Override
    public String rentApartment() {
        return "You must have your application checked.";
    }

    @Override
    public String dispenseKeys() {
        return "You must have your application checked.";
    }
}
