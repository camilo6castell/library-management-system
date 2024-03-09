package model.texts;

import model.loans.Loan;
import model.users.Reader;

import java.util.Scanner;

import static data.DataBase.libraryBooks;
import static data.DataBase.libraryLoans;

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

    public static void setBookLoan(Reader reader){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del libro a pedir prestado: ");
        int index = scanner.nextInt();
        Book bookForLoan = libraryBooks.get(index - 1);
        bookForLoan.setAvailable(bookForLoan.getAvailable()-1);
        bookForLoan.setOnLoan(bookForLoan.getOnLoan()+1);
        Loan.createLoan(libraryLoans, reader.getEmail(), bookForLoan.getTitle(), bookForLoan.getAuthor());
        System.out.println();
        System.out.format("""
                         Préstamo del libro '%s' requerido.
                         
                         Recuerda acercarte a un asistente de biblioteca para recibir el libro deseado.""", bookForLoan.getTitle());
        System.out.println();
        System.out.print("Ingresa 1 para volver a menú anterior: ");
        scanner.next();
    }
}
