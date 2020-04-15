package command.for_dummies;

import command.for_dummies.command.Command;

public class Invoker {

    private Command command;

    public Invoker() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }

}
