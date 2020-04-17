package behavioral.command.for_dummies.receiver;

public class USServer implements Receiver {

    public USServer() {
    }

    @Override
    public void connect() {
        System.out.println("US server: connected");
    }

    @Override
    public void diagnostics() {
        System.out.println("US server: diagnostics");
    }

    @Override
    public void reboot() {
        System.out.println("US server: reboot");
    }

    @Override
    public void shutdown() {
        System.out.println("US server: shutdown");

    }

    @Override
    public void disconnect() {
        System.out.println("US server: disconnect");

    }

}
