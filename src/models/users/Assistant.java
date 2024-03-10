package models.users;

import models.texts.Book;
import models.texts.Novel;
import models.loans.Loan;

import java.util.ArrayList;

public class Assistant extends User {
    public Assistant(String name, String email, String password) {
        super(name, email, password, "assistant");
    }

    // BOOKS METHODS
    public ArrayList<Book> addBook(ArrayList<Book> libraryBooks, String title, String author, int quantity,
                                   int available, int onLoan, String knowledgeArea, int pages) {
        boolean isBook = libraryBooks.stream().anyMatch(object -> object.getTitle().equals(title));
        if (isBook) {
            System.out.println("El libro con el título " + title + " ya se encuentra en nuestro registro. El libro " +
                    "no se agregará a la biblioteca.");
        } else {
            Book newBook = new Book(title, author, quantity, available, onLoan, knowledgeArea, pages);
            libraryBooks.add(newBook);
            System.out.println("El libro con el título " + title + " ha sido agregado a nuestra biblioteca.");
        }
        return libraryBooks;
    }

    public ArrayList<Book> updateBook(ArrayList<Book> libraryBooks, Book outDatedBook, Book upDatedBook) {
        int index = libraryBooks.indexOf(outDatedBook);
        if (index == -1) {
            System.out.println("El libro que quieres actualizar no está registrado.");
        } else {
            libraryBooks.set(index, upDatedBook);
            System.out.println("El libro ha sido actualizado correctamente.");
        }
        return libraryBooks;
    }

    public ArrayList<Book> deleteBook(ArrayList<Book> libraryBooks, Book toDeleteBook) {
        int index = libraryBooks.indexOf(toDeleteBook);
        if (index == -1) {
            System.out.println("El libro que quieres eliminar no está registrado.");
        } else {
            libraryBooks.remove(index);
            System.out.println("El libro ha sido eliminado correctamente.");
        }
        return libraryBooks;
    }

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

    //
    // NOVELS METHODS
    public ArrayList<Novel> addNovel(ArrayList<Novel> libraryNovels, String title, String author, int quantity,
                                     int available, int onLoan, String genre, int suggestedReadingAge) {
        boolean isBook = libraryNovels.stream().anyMatch(object -> object.getTitle().equals(title));
        if (isBook) {
            System.out.println("La novela con el título " + title + " ya se encuentra en nuestro registro. " +
                    "La novela no se agregará a la biblioteca.");
        } else {
            Novel newNovel = new Novel(title, author, quantity, available, onLoan, genre, suggestedReadingAge);
            libraryNovels.add(newNovel);
            System.out.println("La novela con el título " + title + " ha sido agregado a nuestra biblioteca.");
        }
        return libraryNovels;
    }

    public ArrayList<Novel> updateNovel(ArrayList<Novel> libraryNovels, Novel outDatedNovel, Novel upDatedNovel) {
        int index = libraryNovels.indexOf(outDatedNovel);
        if (index == -1) {
            System.out.println("La novela que quieres actualizar no está registrada.");
        } else {
            libraryNovels.set(index, upDatedNovel);
            System.out.println("El novela ha sido actualizado correctamente.");
        }
        return libraryNovels;
    }

    public ArrayList<Novel> deleteNovel(ArrayList<Novel> libraryNovels, Novel toDeleteNovel) {
        int index = libraryNovels.indexOf(toDeleteNovel);
        if (index == -1) {
            System.out.println("La novela que quieres eliminar no está registrada.");
        } else {
            libraryNovels.remove(index);
            System.out.println("La novela ha sido eliminado correctamente.");
        }
        return libraryNovels;
    }

    public void  getNovels(ArrayList<Novel> libraryNovels) {
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

    //

    // TEXTS METHODS
    public void  getTexts(ArrayList<Book> libraryBooks, ArrayList<Novel> libraryNovels) {
        for (int i = 0; i < libraryBooks.size(); i++) {
            Book book = libraryBooks.get(i);
            if (i == 0){
                System.out.println("Libros:");
            }
            System.out.format("     %d Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, book.getTitle(), book.getAuthor(), book.getPages());
        }
        for (int i = 0; i < libraryNovels.size(); i++) {
            Novel novel = libraryNovels.get(i);
            if (i == 0){
                System.out.println("Novelas:");
            }
            System.out.format("     %d Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, novel.getTitle(), novel.getAuthor(), novel.getSuggestedReadingAge());
        }
    }

    // LOAN METHODS
    public ArrayList<Loan> setLoanDone(ArrayList<Loan> libraryLoans, Loan loanToDone){
        int index = libraryLoans.indexOf(loanToDone);
        if (index == -1) {
            System.out.println("Error, el préstamo no se ha hecho.");
        } else {
            loanToDone.setStatus("Done");
            libraryLoans.set(index, loanToDone);
            System.out.println("El texto se ha entregado correctamente.");
        }
        return libraryLoans;
    }
    public ArrayList<Loan> setLoanFinalized(ArrayList<Loan> libraryLoans, Loan loanToFinalized){
        int index = libraryLoans.indexOf(loanToFinalized);
        if (index == -1) {
            System.out.println("Error, el préstamo no se ha hecho.");
        } else {
            loanToFinalized.setStatus("Finalized");
            libraryLoans.set(index, loanToFinalized);
            System.out.println("El texto se ha recibido correctamente.");
        }
        return libraryLoans;
    }
}
