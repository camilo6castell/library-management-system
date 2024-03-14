package src.usecases.book;

import src.data.DataBase;
import src.models.texts.Book;
import src.usecases.interfaces.IUseCase;

public class ShowAllBooksUseCase {

    public void execute() {
        for (int i = 0; i < DataBase.libraryBooks.size(); i++) {
            Book book = DataBase.libraryBooks.get(i);
            System.out.format("%d - Titulo: %s - Autor: %s\n", i + 1, book.getTitle(), book.getAuthor());
        }
    }
}
