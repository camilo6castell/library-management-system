package model.texts;

public class Novel extends Text {
    private String genre;
    private int suggestedReadingAge;

    public Novel(String title, String author, int quantity, int available, int onLoan, String genre, int suggestedReadingAge) {
        super(title, author, quantity, available, onLoan);
        this.genre = genre;
        this.suggestedReadingAge = suggestedReadingAge;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSuggestedReadingAge() {
        return suggestedReadingAge;
    }

    public void setSuggestedReadingAge(int suggestedReadingAge) {
        this.suggestedReadingAge = suggestedReadingAge;
    }
}

