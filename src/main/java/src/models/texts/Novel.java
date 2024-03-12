package src.models.texts;

public class Novel extends Text {
    private String genre;
    private int suggestedReadingAge;

    public Novel(String title, String author, int quantity, String genre, int suggestedReadingAge) {
        super(title, author, quantity);
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

