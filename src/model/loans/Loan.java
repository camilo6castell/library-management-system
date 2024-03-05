package model.loans;

public class Loan {
    private String reader;
    private String title;
    private String author;
    private String status;

    public Loan(String reader, String title, String author, String status ) {
        this.reader = reader;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
