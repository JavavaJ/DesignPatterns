package behavioral.mediator.for_dummies;

import behavioral.mediator.for_dummies.constants.MediatorConstants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PurchasePage {

    private Mediator mediator;
    private String response = MediatorConstants.NO;

    public PurchasePage(Mediator mediator) {
        this.mediator = mediator;
    }

    public void go() {
        System.out.println("Buy the item now? [y/n]? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            response = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response.equals(MediatorConstants.YES)) {
            System.out.println("Thanks for your purchase.");
        }
        mediator.handle(MediatorConstants.PURCHASE_EXIT);
    }
}
