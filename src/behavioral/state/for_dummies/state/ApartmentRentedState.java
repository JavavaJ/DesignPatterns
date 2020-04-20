package behavioral.state.for_dummies.state;

import behavioral.state.for_dummies.IAutomat;

public class ApartmentRentedState implements State {
    private IAutomat automat;

    public ApartmentRentedState(IAutomat automat) {
        this.automat = automat;
    }

    @Override
    public String gotApplication() {
        return "Hang on, we are renting you an apartment.";
    }

    @Override
    public String checkApplication() {
        return "Hang on, we are renting you an apartment.";
    }

    @Override
    public String rentApartment() {
        automat.setCount(automat.getCount() - 1);
        return "Renting you an apartment...";
    }

    @Override
    public String dispenseKeys() {
        if (automat.getCount() <= 0) {
            automat.setState(automat.getFullyRentedState());
        } else {
            automat.setState(automat.getWaitingState());
        }
        return "Here are your keys!";
    }
}
