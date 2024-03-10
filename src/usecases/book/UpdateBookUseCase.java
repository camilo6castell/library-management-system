package usecases.book;

import models.texts.Book;
import usecases.interfaces.TextUseCase;

import java.util.ArrayList;

public class UpdateBookUseCase implements TextUseCase<ArrayList<Book>, Book, Book> {

    @Override
    public ArrayList<Book> execute(ArrayList<Book> libraryBooks, Book outDatedBook, Book upDatedBook) {
        int index = libraryBooks.indexOf(outDatedBook);
        if (index == -1) {
            System.out.println("El libro que quieres actualizar no está registrado.");
        } else {
            libraryBooks.set(index, upDatedBook);
            System.out.println("El libro ha sido actualizado correctamente.");
        }
        return null;
    }

    @Override
    public ArrayList<Book> execute(ArrayList<Book> valueA, Book valueB, Book valueBB, Book valueC, Book valueCC, Book valueCCCC, Book valueBBB, Book valueCCC) {
        return null;
    }

    @Override
    public void execute() {}
}
