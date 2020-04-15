package command.for_dummies.receiver;

public class EuroServer implements Receiver {

    public EuroServer() {
    }

    @Override
    public void connect() {
        System.out.println("Euro server: connected");
    }

    @Override
    public void diagnostics() {
        System.out.println("Euro server: diagnostics");
    }

    @Override
    public void reboot() {
        System.out.println("Euro server: reboot");
    }

    @Override
    public void shutdown() {
        System.out.println("Euro server: shutdown");

    }

    @Override
    public void disconnect() {
        System.out.println("Euro server: disconnect");

    }

}
