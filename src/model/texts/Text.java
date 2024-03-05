package model.texts;

public abstract class Text {

    private String title;
    private String author;
    private int quantity;
    private int available;
    private int onLoan;

    public Text(String title, String author, int quantity, int available, int onLoan ) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.available = available;
        this.onLoan = onLoan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getOnLoan() {
        return onLoan;
    }

    public void setOnLoan(int onLoan) {
        this.onLoan = onLoan;
    }
}
