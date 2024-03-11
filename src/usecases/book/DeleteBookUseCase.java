package usecases.book;

import models.texts.Book;
import usecases.interfaces.TextUseCase;

import java.util.ArrayList;

public class DeleteBookUseCase implements TextUseCase<ArrayList<Book>, Book, Object> {

    @Override
    public void execute(ArrayList<Book> libraryBooks, Book toDeleteBook) {
        int index = libraryBooks.indexOf(toDeleteBook);
        if (index == -1) {
            System.out.println("El libro que quieres eliminar no está registrado.");
        } else {
            libraryBooks.remove(index);
            System.out.println("El libro ha sido eliminado correctamente.");
        }
    }

    @Override
    public ArrayList<Book> execute(ArrayList<Book> valueA, Book valueB, Book valueBB) {
        return null;
    }

    @Override
    public ArrayList<Book> execute(ArrayList<Book> valueA, Book valueB, Book valueBB, Object valueC, Object valueCC, Object valueCCCC, Book valueBBB, Object valueCCC) {
        return null;
    }

    @Override
    public void execute() {

    }
}
