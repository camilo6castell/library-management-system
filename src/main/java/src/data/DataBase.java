package src.data;

import src.models.loans.Loan;
import src.models.texts.Book;
import src.models.texts.Novel;
import src.models.users.Administrator;
import src.models.users.Assistant;
import src.models.users.Reader;
import src.models.users.User;

import java.util.ArrayList;

public class DataBase {
    public static ArrayList<Administrator> libraryAdministrators = new ArrayList<>();
    public static ArrayList<Book> libraryBooks = new ArrayList<>();
    public static ArrayList<Novel> libraryNovels = new ArrayList<>();
    public static ArrayList<Assistant> libraryAssistants = new ArrayList<>();
    public static ArrayList<Reader> libraryReaders = new ArrayList<>();
    public static ArrayList<Loan> libraryLoans = new ArrayList<>();
    public static User session;

    static {
        // ADMIN ARRAY
        libraryAdministrators.add(new Administrator("John Doe", "administrador@pingu.com.co","contraseñasegura123456"));
        // BOOKS ARRAY
        libraryBooks.add(new Book("El origen de las especies", "Charles Darwin", 4,  "Biología", 704));
        libraryBooks.add(new Book("Breve historia del tiempo", "Stephen Hawking", 3, "Física", 216));
        libraryBooks.add(new Book("La gran ilusión", "Stephen Hawking", 3, "Física", 200));
        libraryBooks.add(new Book("El significado de la relatividad", "Albert Einstein", 5, "fisica", 192));
        libraryBooks.add(new Book("El mono desnudo", "Desmond Morris", 0, "Sociedad", 192));
        libraryBooks.add(new Book("Crítica de la razón pura", "Immanuel Kant", 20, "Filosofía", 300));
        libraryBooks.add(new Book("Sin blanca en París y Londres", "George Orwell", 20, "Filosofía", 300));

        // NOVELS ARRAY
        libraryNovels.add(new Novel("La rebelión en la granja", "George Orwell", 10, "Distopia", 15));
        libraryNovels.add(new Novel("1984", "George Orwell", 10, "Distopia", 15));
        libraryNovels.add(new Novel("Cien años de soledad,", "Gabriel García Márquez", 3, "Realismo mágico", 12));
        libraryNovels.add(new Novel("El Conde de Montecristo", "Alexandre Dumas", 5, "Clásica", 15));
        libraryNovels.add(new Novel("Crimen y castigo", "Fiódor Dostoievski", 11, "Social", 15));
        libraryNovels.add(new Novel("Crónica de una muerte anunciadao", "Gabriel García Márquez", 20, "Cultura", 15));
        // ASSISTANT ARRAY
        libraryAssistants.add(new Assistant("asistente1", "asistente1@asistente1.com", "asistente1"));
        // READERS ARRAY
        libraryReaders.add(new Reader("reader1", "reader1@reader1.com", "reader1"));
        // LOANS ARRAY
        libraryLoans.add(new Loan("reader1@reader1.com", "El Conde de Montecristo", "Alexandre Dumas"));
    }

}
