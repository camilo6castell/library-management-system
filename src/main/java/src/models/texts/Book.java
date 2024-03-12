package src.models.texts;

import src.models.loans.Loan;
import src.models.users.Reader;

import java.util.Scanner;

import static src.data.DataBase.libraryBooks;
import static src.data.DataBase.libraryLoans;

public class Book extends Text {
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
}
