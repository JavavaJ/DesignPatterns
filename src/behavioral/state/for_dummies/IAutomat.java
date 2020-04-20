package behavioral.state.for_dummies;

import behavioral.state.for_dummies.state.State;

public interface IAutomat {
    void gotApplication();
    void checkApplication();
    void rentApartment();
    void setState(State state);
    State getWaitingState();
    State getGotApplicationState();
    State getApartmentRentedState();
    State getFullyRentedState();
    int getCount();
    void setCount(int roomsNumber);
}
