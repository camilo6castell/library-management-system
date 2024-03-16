package src.usecases.book;

import src.models.texts.Book;
import src.usecases.interfaces.IUseCase;

import static src.data.DataBase.libraryBooks;

public class ShowAllAvailableBooksToBorrow implements IUseCase<Object, Object> {

    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        for (Book book : libraryBooks){
            if (book.getAvailable() > 0){
                System.out.format("%d - Título: %s - Autor: %s - Area del conocimiento: %s -  Páginas: %d\n",
                        libraryBooks.indexOf(book) + 1, book.getTitle(),  book.getAuthor(),
                        book.getKnowledgeArea(), book.getPages());
            }
        }
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
