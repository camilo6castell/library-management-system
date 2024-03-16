package src.models.loans;

import java.time.LocalDate;
import java.util.ArrayList;

public class Loan {
    private String email;
    private String title;
    private String author;
    private String status;
    private LocalDate creationDate;
    private LocalDate finishDate;

    public Loan(String email, String title, String author) {
        this.email = email;
        this.title = title;
        this.author = author;
        this.status = "Required";
        this.creationDate = LocalDate.now();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate currentDate) {
        this.creationDate = currentDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }
}
