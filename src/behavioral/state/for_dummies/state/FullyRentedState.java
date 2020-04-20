package behavioral.state.for_dummies.state;

import behavioral.state.for_dummies.IAutomat;

public class FullyRentedState implements State {
    private IAutomat automat;
    private String sorryPhrase = "Sorry, we're fully rented.";

    public FullyRentedState(IAutomat automat) {
        this.automat = automat;
    }

    @Override
    public String gotApplication() {
        return sorryPhrase;
    }

    @Override
    public String checkApplication() {
        return sorryPhrase;

    }

    @Override
    public String rentApartment() {
        return sorryPhrase;
    }

    @Override
    public String dispenseKeys() {
        return sorryPhrase;

    }
}
