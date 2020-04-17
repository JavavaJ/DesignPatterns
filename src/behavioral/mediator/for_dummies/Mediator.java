package behavioral.mediator.for_dummies;

import behavioral.mediator.for_dummies.constants.MediatorConstants;

public class Mediator {
    private WelcomePage welcomePage;
    private ShopPage shopPage;
    private PurchasePage purchasePage;
    private ExitPage exitPage;

    public Mediator() {
        welcomePage = new WelcomePage(this);
        shopPage = new ShopPage(this);
        purchasePage = new PurchasePage(this);
        exitPage = new ExitPage(this);
    }

    public void handle(String state) {
        if (state.equals(MediatorConstants.WELCOME_SHOP)) {
            shopPage.go();
        } else if (state.equals(MediatorConstants.SHOP_PURCHASE)) {
            purchasePage.go();
        } else if (state.equals(MediatorConstants.PURCHASE_EXIT)) {
            exitPage.go();
        } else if (state.equals(MediatorConstants.WELCOME_EXIT)) {
            exitPage.go();
        } else if (state.equals(MediatorConstants.SHOP_EXIT)) {
            exitPage.go();
        }
    }

    public WelcomePage getWelcomePage() {
        return welcomePage;
    }
}
