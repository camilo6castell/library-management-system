package src.usecases.text;

import static src.data.DataBase.libraryBooks;
import static src.data.DataBase.libraryNovels;

import src.models.texts.Book;
import src.models.texts.Novel;
import src.models.texts.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowAllTextsByAuthorUseCase {

    public void execute() {
        // MAP TO STORE BOOKS AND NOVLS
        Map<String, List<Book>> booksByAuthor = groupByAuthor(libraryBooks);
        Map<String, List<Novel>> novelsByAuthor = groupByAuthor(libraryNovels);

        // ITERATIONS ON AUTHORS
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

    // GENERIC AS A RETURN
    private static <T extends Text> Map<String, List<T>> groupByAuthor(List<T> items) {
        Map<String, List<T>> result = new HashMap<>();
        for (T item : items) {
            String author = item.getAuthor();
            result.computeIfAbsent(author, k -> new ArrayList<>()).add(item);
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
