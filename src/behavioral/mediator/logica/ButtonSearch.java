package behavioral.mediator.logica;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonSearch extends JButton implements Command {
    private Mediator mediator;

    public ButtonSearch(ActionListener listener, Mediator mediator) {
        super("Search");
        addActionListener(listener);
        this.mediator = mediator;
        mediator.registerSearch(this);
    }

    @Override
    public void execute() {
        mediator.search();
    }
}
