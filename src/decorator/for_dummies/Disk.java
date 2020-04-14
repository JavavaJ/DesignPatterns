package decorator.for_dummies;

public class Disk extends ComponentDecorator {

    Computer computer;

    public Disk(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + " and a disk";
    }
}
