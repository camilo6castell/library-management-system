package usecases.book;

import data.DataBase;
import models.texts.Book;
import usecases.interfaces.TextUseCase;

public class ShowAllBooksUseCase implements TextUseCase<Object, Object, Object> {
    @Override
    public void execute() {
        for (int i = 0; i < DataBase.libraryBooks.size(); i++) {
            Book book = DataBase.libraryBooks.get(i);
            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, book.getTitle(), book.getAuthor());
        }
    }

    @Override
    public Object execute(Object valueA, Object valueB, Object valueBB) {
        return null;
    }

    @Override
    public Object execute(Object valueA, Object valueB, Object valueBB, Object valueC, Object valueCC, Object valueCCCC, Object valueBBB, Object valueCCC) {
        return null;
    }
}
