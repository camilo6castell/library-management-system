package src.models.texts;

public class Novel extends Text implements Cloneable {
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

    @Override
    public Novel clone() {
        try {
            Novel clone = (Novel) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

