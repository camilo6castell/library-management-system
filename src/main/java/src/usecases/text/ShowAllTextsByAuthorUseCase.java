package src.usecases.text;

import static src.data.DataBase.libraryBooks;
import static src.data.DataBase.libraryNovels;

import src.models.texts.Book;
import src.models.texts.Novel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowAllTextsByAuthorUseCase {

    // Create map to group novels and books by author
    private static HashMap<String, List<Object>> authorsMap = new HashMap<>();

    public static void execute() {

        processingBooks();
        processingNovels();

        // printing results
        for (Map.Entry<String, List<Object>> entry : authorsMap.entrySet()) {
            String author = entry.getKey();
            List<Object> texts = entry.getValue();

            System.out.println("Autor: " + author);

            printingTextsByAuthor(texts);

            System.out.println();
        }
    }

    private static void processingBooks(){
        for (Book book : libraryBooks) {
            String author = book.getAuthor();
            authorsMap.computeIfAbsent(author, key -> new ArrayList<>()).add(book);
        }
    }

    private static void processingNovels(){
        for (Novel novela : libraryNovels) {
            String author = novela.getAuthor();
            authorsMap.computeIfAbsent(author, key -> new ArrayList<>()).add(novela);
        }
    }

    private static void printingTextsByAuthor(List<Object> texts){
        for (Object text : texts) {
            if (text instanceof Book) {
                Book book = (Book) text;
                System.out.println("  - Libro: " + book.getTitle());
            } else if (text instanceof Novel) {
                Novel novel = (Novel) text;
                System.out.println("  - Novela: " + novel.getTitle());
            }
        }
    }
}
