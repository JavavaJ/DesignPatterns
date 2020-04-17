package behavioral.mediator.for_dummies;

import behavioral.mediator.for_dummies.constants.MediatorConstants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WelcomePage {

    private Mediator mediator;
    private String response = MediatorConstants.NO;

    public WelcomePage(Mediator mediator) {
        this.mediator = mediator;
    }

    public void go() {
        System.out.println("Wanna shop? [y/n]");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            response = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (response.equals(MediatorConstants.YES)) {
            mediator.handle(MediatorConstants.WELCOME_SHOP);
        } else {
            mediator.handle(MediatorConstants.WELCOME_EXIT);
        }
    }

}
