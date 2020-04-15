package command.head_first;

// Invoker in OOP terms
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
