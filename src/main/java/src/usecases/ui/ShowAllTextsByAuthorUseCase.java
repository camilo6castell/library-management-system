package usecases.ui;

import static data.DataBase.libraryBooks;
import static data.DataBase.libraryNovels;

import models.texts.Book;
import models.texts.Novel;
import models.texts.Text;
import usecases.interfaces.IUseCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowAllTextsByAuthorUseCase implements IUseCase<Object, Object> {

    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        // Creamos un mapa para almacenar los libros y novelas por autor
        Map<String, List<Book>> booksByAuthor = groupByAuthor(libraryBooks);
        Map<String, List<Novel>> novelsByAuthor = groupByAuthor(libraryNovels);

        // Iteramos sobre los autores
        for (String author : booksByAuthor.keySet()) {
            System.out.println("Autor: " + author+ "\n");
//            System.out.println("Libros:\n");
            printBooks(booksByAuthor.get(author));
            System.out.println();
        }

        for (String author : novelsByAuthor.keySet()) {
            System.out.println("Autor: " + author + "\n");
//            System.out.println("Novelas:\n");
            printNovels(novelsByAuthor.get(author));
            System.out.println();
        }
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }

    // GENERIC AS A RETURN
    private static <T extends Text> Map<String, List<T>> groupByAuthor(List<T> items) {
        Map<String, List<T>> result = new HashMap<>();
        for (T item : items) {
            String autor = item.getAuthor();
            result.computeIfAbsent(autor, k -> new ArrayList<>()).add(item);
        }
        return result;
    }

    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println("    Titulo: " + book.getTitle() + " - Tipo: Libro");
        }
    }

    private static void printNovels(List<Novel> novels) {
        for (Novel novel : novels) {
            System.out.println("    Titulo: " + novel.getTitle() + " - Tipo: Novela");
        }
    }
}
