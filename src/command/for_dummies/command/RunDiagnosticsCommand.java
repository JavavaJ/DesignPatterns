package command.for_dummies.command;

import command.for_dummies.receiver.Receiver;

public class RunDiagnosticsCommand implements Command {

    private Receiver receiver;

    public RunDiagnosticsCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.diagnostics();
        receiver.disconnect();
        System.out.println();
    }

    @Override
    public void undo() {
        System.out.println("Can't undo.");
        System.out.println();
    }
}
