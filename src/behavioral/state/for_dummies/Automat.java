package behavioral.state.for_dummies;

import behavioral.state.for_dummies.state.*;

public class Automat implements IAutomat {
    State waitingState;
    State gotApplicationState;
    State apartmentRentedState;
    State fullyRentedState;
    State state;
    int count;

    public Automat(int count) {
        this.count = count;
        waitingState = new WaitingState(this);
        gotApplicationState = new GotApplicationState(this);
        apartmentRentedState = new ApartmentRentedState(this);
        fullyRentedState = new FullyRentedState(this);
        state = waitingState;
    }

    @Override
    public void gotApplication() {
        System.out.println(state.gotApplication());
    }

    @Override
    public void checkApplication() {
        System.out.println(state.checkApplication());
    }

    @Override
    public void rentApartment() {
        System.out.println(state.rentApartment());
        System.out.println(state.dispenseKeys());
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public State getWaitingState() {
        return waitingState;
    }

    @Override
    public State getGotApplicationState() {
        return gotApplicationState;
    }

    @Override
    public State getApartmentRentedState() {
        return apartmentRentedState;
    }

    @Override
    public State getFullyRentedState() {
        return fullyRentedState;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int roomsNumber) {
        this.count = roomsNumber;
    }
}
