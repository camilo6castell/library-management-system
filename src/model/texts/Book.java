package model.texts;

public class Book extends Text {
    private String knowledgeArea;
    private int pages;

    public Book(String title, String author, int quantity, int available, int onLoan, String knowledgeArea, int pages) {
        super(title, author, quantity, available, onLoan);
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
}
