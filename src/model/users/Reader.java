package model.users;

import model.texts.Book;
import model.texts.Novel;

import model.loans.Loan;

import java.util.ArrayList;

public class Reader extends User {
    public Reader(String name, String email, String password) {
        super(name, email, password, "reader");
    }

    // TEXTS METHODS
    public void  getTextsByAuthors(ArrayList<Book> libraryBooks, ArrayList<Novel> libraryNovels) {
        for (Book book : libraryBooks) {
            System.out.format("Titulo: %s - Autor: %s\n", book.getAuthor(), book.getTitle());
        }
        for (Novel novel : libraryNovels) {
            System.out.format("Titulo: %s - Autor: %s\n", novel.getAuthor(), novel.getTitle());
        }
    }
    // BOOKS
    public ArrayList<Loan> createLoan(ArrayList<Loan> libraryLoans, String reader, String title, String author){
        libraryLoans.add(new Loan(reader, title, author));
        return libraryLoans;
    }
}
