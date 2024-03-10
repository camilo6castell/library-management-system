package usecases.book;

import models.texts.Book;
import usecases.interfaces.TextUseCase;

import java.util.ArrayList;

public class AddBookUseCase implements TextUseCase<ArrayList<Book>, String, Integer> {

    @Override
    public ArrayList<Book> execute(ArrayList<Book> libraryBooks, String title, String author, Integer quantity,
                                   Integer available, Integer onLoan, String knowledgeArea, Integer pages) {
        boolean isBook = libraryBooks.stream().anyMatch(object -> object.getTitle().equals(title));
        if (isBook) {
            System.out.println("El libro con el título " + title + " ya se encuentra en nuestro registro. El libro " +
                    "no se agregará a la biblioteca.");
        } else {
            Book newBook = new Book(title, author, quantity, available, onLoan, knowledgeArea, pages);
            libraryBooks.add(newBook);
            System.out.println("El libro con el título " + title + " ha sido agregado a nuestra biblioteca.");
        }
        return null;
    }

    @Override
    public void execute() {}

    @Override
    public ArrayList<Book> execute(ArrayList<Book> valueA, String valueB, String valueBB) {
        return null;
    }
}


