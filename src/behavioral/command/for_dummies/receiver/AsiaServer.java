package behavioral.command.for_dummies.receiver;

public class AsiaServer implements Receiver {

    public AsiaServer() {
    }

    @Override
    public void connect() {
        System.out.println("Asia server: connected");
    }

    @Override
    public void diagnostics() {
        System.out.println("Asia server: diagnostics");
    }

    @Override
    public void reboot() {
        System.out.println("Asia server: reboot");
    }

    @Override
    public void shutdown() {
        System.out.println("Asia server: shutdown");
    }

    @Override
    public void disconnect() {
        System.out.println("Asia server: disconnect");
    }
}
