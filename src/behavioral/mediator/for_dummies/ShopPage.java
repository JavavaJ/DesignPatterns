package behavioral.mediator.for_dummies;

import behavioral.mediator.for_dummies.constants.MediatorConstants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShopPage {

    private Mediator mediator;
    private String response = MediatorConstants.NO;

    public ShopPage(Mediator mediator) {
        this.mediator = mediator;
    }

    public void go() {
        System.out.println("Ready to purchase? [y/n]? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            response = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response.equals(MediatorConstants.YES)) {
            mediator.handle(MediatorConstants.SHOP_PURCHASE);
        } else {
            mediator.handle(MediatorConstants.SHOP_EXIT);
        }
    }
}
