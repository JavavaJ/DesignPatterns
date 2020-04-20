package behavioral.mediator.proselyte;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {

    private User admin;
    private List<User> users;

    public SimpleTextChat() {
        users = new ArrayList<>();
    }

    @Override
    public void addUserToChat(User user) {
        users.add(user);
    }

    @Override
    public void setAdmin(User admin) {
        this.admin = admin;
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // user can't send a message to himself
            if (!u.equals(user)) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
