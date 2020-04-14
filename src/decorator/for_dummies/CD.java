package decorator.for_dummies;

public class CD extends ComponentDecorator {

    Computer computer;

    public CD(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + " and a CD";
    }
}
