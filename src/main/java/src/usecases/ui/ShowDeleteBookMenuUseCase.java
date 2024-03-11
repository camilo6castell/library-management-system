package usecases.ui;

import data.DataBase;
import models.texts.Book;
import usecases.book.DeleteBookUseCase;
import usecases.book.ShowAllBooksUseCase;
import usecases.interfaces.IUseCase;

import java.util.Scanner;

public class ShowDeleteBookMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                _______________________________________________________________

                Eliminando libro >>
                            
                Elije el libro que deseas eliminar
                
                """);
        new ShowAllBooksUseCase().execute();
        System.out.println();
        System.out.print("Digita el número del libro a eliminar: ");
        int libraryBookIndex = Integer.parseInt(scanner.next());
        Book toDeleteBook = DataBase.libraryBooks.get(libraryBookIndex - 1);
        new DeleteBookUseCase().execute(DataBase.libraryBooks, toDeleteBook);
        new ShowAlertMessageUseCase().execute("\n");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }

    @Override
    public Object execute(Object value) {
        return null;
    }
}
