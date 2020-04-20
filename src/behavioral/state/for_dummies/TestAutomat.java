package behavioral.state.for_dummies;

public class TestAutomat {
    private IAutomat automat;

    public static void main(String[] args) {
        TestAutomat testAutomat = new TestAutomat();
    }

    public TestAutomat() {
        int roomsNumber = 9;
        automat = new Automat(roomsNumber);

        automat.gotApplication();
        automat.checkApplication();
        automat.rentApartment();
    }
}
