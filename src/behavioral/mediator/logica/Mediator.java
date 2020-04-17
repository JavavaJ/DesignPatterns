package behavioral.mediator.logica;

public class Mediator {
    private ButtonView buttonView;
    private ButtonBook buttonBook;
    private ButtonSearch buttonSearch;
    private LabelDisplay labelDisplay;

    public void registerView(ButtonView buttonView) {
        this.buttonView = buttonView;
    }
    public void registerSearch(ButtonSearch buttonSearch) {
        this.buttonSearch = buttonSearch;
    }
    public void registerBook(ButtonBook buttonBook) {
        this.buttonBook = buttonBook;
    }
    public void registerDisplay(LabelDisplay labelDisplay) {
        this.labelDisplay = labelDisplay;
    }

    public void view() {
        buttonView.setEnabled(false);
        buttonSearch.setEnabled(true);
        buttonBook.setEnabled(true);
        labelDisplay.setText("Viewing...");
    }

    public void search() {
        buttonSearch.setEnabled(false);
        buttonBook.setEnabled(true);
        buttonView.setEnabled(true);
        labelDisplay.setText("Searching...");
    }

    public void book() {
        buttonBook.setEnabled(false);
        buttonSearch.setEnabled(true);
        buttonView.setEnabled(true);
        labelDisplay.setText("Booking...");
    }
}
