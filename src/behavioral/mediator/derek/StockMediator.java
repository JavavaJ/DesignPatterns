package behavioral.mediator.derek;

import java.util.ArrayList;
import java.util.List;

public class StockMediator implements Mediator {
    private List<Colleague> colleagues;
    private List<StockOffer> stockBuyOffers;
    private List<StockOffer> stockSellOffers;

    private int colleagueCode = 0;

    public StockMediator() {
        colleagues = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
        stockSellOffers = new ArrayList<>();
    }

    @Override
    public void saleOffer(String stock, int shares, int colleagueCode) {
        boolean stockSold = false;
        for (StockOffer offer : stockBuyOffers) {
            if ((offer.getStockSymbol().equals(stock)) && (offer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + stock + " sold to colleague code " + offer.getColleagueCode());
                stockBuyOffers.remove(offer);
                stockSold = true;
            }
            if (stockSold) {
                break;
            }
        }
        if (!stockSold) {
            System.out.println(shares + " shares of " + stock + " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, colleagueCode);
            stockSellOffers.add(newOffering);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int colleagueCode) {
        boolean stockBought = false;
        for (StockOffer offer : stockSellOffers) {
            if ((offer.getStockSymbol().equals(stock)) && (offer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + stock + " bought by colleague code " + offer.getColleagueCode());
                stockSellOffers.remove(offer);
                stockBought = true;
            }
            if (stockBought) {
                break;
            }
        }
        if (!stockBought) {
            System.out.println(shares + " shares of " + stock + " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, colleagueCode);
            stockBuyOffers.add(newOffering);
        }
    }

    public void getStockOfferings() {
        System.out.println("Stocks for Sale");
        for (StockOffer offer : stockSellOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }

        System.out.println("Stocks Buy Offers");
        for (StockOffer offer : stockBuyOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
        colleagueCode++;
        colleague.setColleagueCode(colleagueCode);
    }
}
