package behavioral.mediator.logica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MediatorExample extends JFrame implements ActionListener {
    private Mediator mediator;

    public MediatorExample() {
        mediator = new Mediator();
        JPanel panel = new JPanel();
        panel.add(new ButtonView(this, mediator));
        panel.add(new ButtonBook(this, mediator));
        panel.add(new ButtonSearch(this, mediator));
        getContentPane().add(new LabelDisplay(mediator),
            BorderLayout.CENTER);
        getContentPane().add(panel, BorderLayout.SOUTH);
        setTitle("Mediator Example");
        setSize(300, 200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof Command) {
            Command command = (Command) e.getSource();
            command.execute();
        }
    }

    public static void main(String[] args) {
        new MediatorExample();
    }

}
