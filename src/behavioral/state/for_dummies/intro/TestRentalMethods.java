package behavioral.state.for_dummies.intro;

public class TestRentalMethods {

    private RentalMethods rentalMethods;

    public static void main(String[] args) {
        TestRentalMethods testRentalMethods = new TestRentalMethods();
    }

    public TestRentalMethods() {
        int roomsNumber = 9;
        rentalMethods = new RentalMethods(roomsNumber);

        rentalMethods.getApplication();
        rentalMethods.checkApplication();
    }
}
