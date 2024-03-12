package src.data;

import src.models.loans.Loan;
import src.models.texts.Book;
import src.models.texts.Novel;
import src.models.users.Administrator;
import src.models.users.Assistant;
import src.models.users.Reader;

import java.util.ArrayList;

public class DataBase {
    public static ArrayList<Administrator> libraryAdministrators = new ArrayList<>();
    public static ArrayList<Book> libraryBooks = new ArrayList<>();
    public static ArrayList<Novel> libraryNovels = new ArrayList<>();
    public static ArrayList<Assistant> libraryAssistants = new ArrayList<>();
    public static ArrayList<Reader> libraryReaders = new ArrayList<>();
    public static ArrayList<Loan> libraryLoans = new ArrayList<>();
    public static Administrator administratorSession;
    public static Assistant assistantSession;
    public static Reader readerSession;

    static {
        // ADMIN ARRAY
        libraryAdministrators.add(new Administrator("John Doe", "test","test"));
        libraryAdministrators.add(new Administrator("John Doe", "administrador@pingu.com.co","contraseñasegura123456"));
        // BOOKS ARRAY
        libraryBooks.add(new Book("El origen de las especies", "Charles Darwin", 4,  "Biología", 704));
        libraryBooks.add(new Book("Breve historia del tiempo", "Stephen Hawking", 3, "Física", 216));
        libraryBooks.add(new Book("El significado de la relatividad", "Albert Einstein", 5, "fisica", 192));
        // NOVELS ARRAY
        libraryNovels.add(new Novel("1984", "George Orwell", 10, "Distopia", 15));
        libraryNovels.add(new Novel("Cien años de soledad,", "Gabriel García Márquez", 3, "Realismo mágico", 12));
        libraryNovels.add(new Novel("El Conde de Montecristo", "Alexandre Dumas", 5, "Clásica", 15));
        // ASSISTANT ARRAY
        libraryAssistants.add(new Assistant("asistente1", "asistente1", "asistente1"));
        // READERS ARRAY
        libraryReaders.add(new Reader("reader1", "reader1", "reader1"));
        // LOANS ARRAY
        libraryLoans.add(new Loan("reader1", "El Conde de Montecristo", "Alexandre Dumas"));
    }

}
