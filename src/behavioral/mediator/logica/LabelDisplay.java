package behavioral.mediator.logica;

import javax.swing.*;

public class LabelDisplay extends JLabel {
    private Mediator mediator;

    public LabelDisplay(Mediator mediator) {
        super("Choose...");
        this.mediator = mediator;
        mediator.registerDisplay(this);
    }
}
