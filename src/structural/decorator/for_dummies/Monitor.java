package structural.decorator.for_dummies;

public class Monitor extends ComponentDecorator{

    Computer computer;

    public Monitor(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + " and a monitor";
    }
}
