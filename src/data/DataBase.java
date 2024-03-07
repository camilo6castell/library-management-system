package data;

import model.loans.Loan;
import model.texts.Book;
import model.texts.Novel;
import model.users.Administrator;
import model.users.Assistant;
import model.users.Reader;

import java.util.ArrayList;

public class DataBase {
    public static ArrayList<Administrator> libraryAdministrators = new ArrayList<>();
    public static ArrayList<Book> libraryBooks = new ArrayList<>();
    public static ArrayList<Novel> libraryNovels = new ArrayList<>();
    public static ArrayList<Assistant> libraryAssistants = new ArrayList<>();
    public static ArrayList<Reader> libraryReaders = new ArrayList<>();
    public static ArrayList<Loan> libraryLoans = new ArrayList<>();

    static {
        // ADMIN ARRAY
        libraryAdministrators.add(new Administrator("John Doe", "test","test"));
        libraryAdministrators.add(new Administrator("John Doe", "administrador@pingu.com.co","contraseñasegura123456"));
        // BOOKS ARRAY
        libraryBooks.add(new Book("El origen de las especies", "Charles Darwin", 4, 4,0, "Biología", 704));
        libraryBooks.add(new Book("Breve historia del tiempo", "Stephen Hawking", 3, 3,0, "Física", 216));
        libraryBooks.add(new Book("El significado de la relatividad", "Albert Einstein", 5,5, 0, "fisica", 192));
        // NOVELS ARRAY
        libraryNovels.add(new Novel("1984", "George Orwell", 10, 10, 0,"Distopia", 15));
        libraryNovels.add(new Novel("Cien años de soledad,", "Gabriel García Márquez", 3,3, 0, "Realismo mágico", 12));
        libraryNovels.add(new Novel("El Conde de Montecristo", "Alexandre Dumas", 5,5, 0, "Clásica", 15));
        // ASSISTANT ARRAY
        libraryAssistants.add(new Assistant("asistente1", "asistente1", "asistente1"));
        // READERS ARRAY
        libraryReaders.add(new Reader("reader1", "reader1", "reader1"));
        // LOANS ARRAY
        libraryLoans.add(new Loan("reader1", "El Conde de Montecristo", "Alexandre Dumas"));
    }

    public static ArrayList<Administrator> getLibraryAdministrators() {
        return libraryAdministrators;
    }

    public static void setLibraryAdministrators(ArrayList<Administrator> libraryAdministrators) {
        DataBase.libraryAdministrators = libraryAdministrators;
    }

    public static ArrayList<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public static void setLibraryBooks(ArrayList<Book> libraryBooks) {
        DataBase.libraryBooks = libraryBooks;
    }

    public static ArrayList<Novel> getLibraryNovels() {
        return libraryNovels;
    }

    public static void setLibraryNovels(ArrayList<Novel> libraryNovels) {
        DataBase.libraryNovels = libraryNovels;
    }

    public static ArrayList<Assistant> getLibraryAssistants() {
        return libraryAssistants;
    }

    public static void setLibraryAssistants(ArrayList<Assistant> libraryAssistants) {
        DataBase.libraryAssistants = libraryAssistants;
    }

    public static ArrayList<Reader> getLibraryReaders() {
        return libraryReaders;
    }

    public static void setLibraryReaders(ArrayList<Reader> libraryReaders) {
        DataBase.libraryReaders = libraryReaders;
    }

    public static ArrayList<Loan> getLibraryLoans() {
        return libraryLoans;
    }

    public static void setLibraryLoans(ArrayList<Loan> libraryLoans) {
        DataBase.libraryLoans = libraryLoans;
    }
}
