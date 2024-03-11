package usecases.book;

import data.DataBase;
import models.texts.Book;
import usecases.interfaces.IUseCase;

public class ShowAllBooksUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        for (int i = 0; i < DataBase.libraryBooks.size(); i++) {
            Book book = DataBase.libraryBooks.get(i);
            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, book.getTitle(), book.getAuthor());
        }
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
