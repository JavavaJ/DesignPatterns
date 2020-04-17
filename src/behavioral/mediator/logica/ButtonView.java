package behavioral.mediator.logica;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonView extends JButton implements Command {
    private Mediator mediator;

    public ButtonView(ActionListener listener, Mediator mediator) {
        super("View");
        addActionListener(listener);
        this.mediator = mediator;
        mediator.registerView(this);
    }

    @Override
    public void execute() {
        mediator.view();
    }
}
