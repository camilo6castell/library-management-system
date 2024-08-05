package src.models.texts;

public class Book extends Text implements Cloneable {
    private String knowledgeArea;
    private int pages;

    public Book(String title, String author, int quantity, String knowledgeArea, int pages) {
        super(title, author, quantity);
        this.knowledgeArea = knowledgeArea;
        this.pages = pages;
    }
    public String getKnowledgeArea() {
        return knowledgeArea;
    }

    public void setKnowledgeArea(String knowledgeArea) {
        this.knowledgeArea = knowledgeArea;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public Book clone() {
        try {
//            Book clone = (Book) super.clone();
//            TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
