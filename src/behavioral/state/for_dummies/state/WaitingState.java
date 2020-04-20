package behavioral.state.for_dummies.state;

import behavioral.state.for_dummies.IAutomat;

public class WaitingState implements State {
    private IAutomat automat;

    public WaitingState(IAutomat automat) {
        this.automat = automat;
    }

    @Override
    public String gotApplication() {
        automat.setState(automat.getGotApplicationState());
        return "Thanks for the application.";
    }

    @Override
    public String checkApplication() {
        return "You have to submit an application.";
    }

    @Override
    public String rentApartment() {
        return "You have to submit an application.";
    }

    @Override
    public String dispenseKeys() {
        return "You have to submit an application.";
    }
}
