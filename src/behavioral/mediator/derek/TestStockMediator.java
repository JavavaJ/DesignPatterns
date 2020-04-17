package behavioral.mediator.derek;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestStockMediator {

    public static void main(String[] args) {
        StockMediator NYSE = new StockMediator();
        GormanSlacks broker1 = new GormanSlacks(NYSE);
        JTPoorman broker2 = new JTPoorman(NYSE);

        NYSE.addColleague(broker1);
        NYSE.addColleague(broker2);

        broker1.saleOffer("MSFT", 100);
        broker1.saleOffer("GOOG", 50);

        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);

        broker1.buyOffer("NRG", 10);

        NYSE.getStockOfferings();
    }
}
