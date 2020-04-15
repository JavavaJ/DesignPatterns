package command.for_dummies.command;

import command.for_dummies.receiver.Receiver;

public class RebootCommand implements Command {

    private Receiver receiver;

    public RebootCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.reboot();
        receiver.disconnect();
        System.out.println();
    }

    @Override
    public void undo() {
        System.out.println("Undoing...");
        receiver.connect();
        receiver.shutdown();
        receiver.disconnect();
        System.out.println();
    }
}
