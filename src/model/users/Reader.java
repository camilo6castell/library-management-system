package model.users;

import data.DataBase;
import model.texts.Book;
import model.texts.Novel;

import model.loans.Loan;

import java.util.ArrayList;
import java.util.Scanner;

import static data.DataBase.*;

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


    // LOAN METHODS
    public ArrayList<Loan> createLoan(ArrayList<Loan> libraryLoans, String reader, String title, String author){
        libraryLoans.add(new Loan(reader, title, author));
        return libraryLoans;
    }
    // BOOKS METHODS
    public void getBooks(ArrayList<Book> libraryBooks) {
        // for (Book book : libraryBooks) {
        //    System.out.println("Título: " + book.getTitle());
        //    System.out.println("Autor: " + book.getAuthor());
        //    System.out.println("Páginas: " + book.getPages());
        //    System.out.println();
        //}
        for (int i = 0; i < libraryBooks.size(); i++) {
            Book book = libraryBooks.get(i);
            System.out.format("%d Titulo: %s - Autor: %s - Páginas: %d\n", i + 1, book.getTitle(), book.getAuthor(), book.getPages());
        }
    }
    public void getAvailableBooks(ArrayList<Book> libraryBooks) {
        for (int i = 0; i < libraryBooks.size(); i++) {
            Book book = libraryBooks.get(i);
            if (i == 0){
                System.out.println("Libros:");
            }
            if (book.getAvailable() > 0){
                System.out.format("     Código: %d - Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, book.getTitle(), book.getAuthor(), book.getPages());
            }
        }
    }
    public void setBookLoan(Reader reader){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del libro a pedir prestado: ");
        int index = scanner.nextInt();
        Book bookForLoan = libraryBooks.get(index - 1);
        reader.createLoan(libraryLoans, reader.getEmail(), bookForLoan.getTitle(), bookForLoan.getAuthor());
        System.out.println();
        System.out.print("Préstamo requerido. Recuerda acercarte a un asistente de biblioteca para recibir el libro deseado.");
        System.out.println();
        System.out.print("Ingresa 1 para volver a menú anterior: ");
        scanner.next();
    }
    // NOVELS METHODS
    public void getNovels(ArrayList<Novel> libraryNovels) {
        //for (Novel novel : libraryNovels) {
        //    System.out.println("Título: " + novel.getTitle());
        //    System.out.println("Autor: " + novel.getAuthor());
        //    System.out.println("Suggested reading age: " + novel.getSuggestedReadingAge());
        //    System.out.println();
        //}
        for (int i = 0; i < libraryNovels.size(); i++) {
            Novel novel = libraryNovels.get(i);
            System.out.format("%d Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, novel.getTitle(), novel.getAuthor(), novel.getSuggestedReadingAge());
        }
    }
    public void setNovelLoan(Reader reader){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código de la novela a pedir prestada: ");
        int index = scanner.nextInt();
        Novel novelForLoan = libraryNovels.get(index - 1);
        reader.createLoan(libraryLoans, reader.getEmail(), novelForLoan.getTitle(), novelForLoan.getAuthor());
        System.out.println();
        System.out.print("Préstamo requerido. Recuerda acercarte a un asistente de biblioteca para recibir la novela deseada.");
        System.out.println();
        System.out.print("Ingresa 1 para volver a menú anterior: ");
        scanner.next();
    }

    public void getAvailableNovels(ArrayList<Novel> libraryNovels){
        for (int i = 0; i < libraryNovels.size(); i++) {
            Novel novel = libraryNovels.get(i);
            if (i == 0){
                System.out.println("Novelas:");
            }
            if (novel.getAvailable() > 0) {
                System.out.format("     %d Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, novel.getTitle(), novel.getAuthor(), novel.getSuggestedReadingAge());
            }
        }
    }
}
