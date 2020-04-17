package behavioral.mediator.logica;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonBook extends JButton implements Command {
    private Mediator mediator;

    public ButtonBook(ActionListener listener, Mediator mediator) {
        super("Book");
        addActionListener(listener);
        this.mediator = mediator;
        mediator.registerBook(this);
    }

    @Override
    public void execute() {
        mediator.book();
    }
}
