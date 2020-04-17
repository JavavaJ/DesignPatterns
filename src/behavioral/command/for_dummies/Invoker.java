package behavioral.command.for_dummies;

import behavioral.command.for_dummies.command.Command;
import behavioral.command.for_dummies.utils.LimitedQueue;

public class Invoker {

    private Command command;
    private LimitedQueue<Command> commandQueue;

    public Invoker() {
        commandQueue = new LimitedQueue<>(5);
    }

    public void setCommand(Command command) {
        commandQueue.add(command);
    }

    public void run() {
         commandQueue.getLast().execute();
    }

    public void undo() {
        commandQueue.getLast().undo();
        commandQueue.removeLast();
    }

}
