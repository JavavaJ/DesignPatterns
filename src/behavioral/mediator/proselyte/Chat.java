package behavioral.mediator.proselyte;

// the interface represents Mediator
public interface Chat {
    void sendMessage(String message, User user);
    void addUserToChat(User user);
    void setAdmin(User admin);
}
