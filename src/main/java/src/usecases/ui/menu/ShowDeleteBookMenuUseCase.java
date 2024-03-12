package src.usecases.ui.menu;

import src.data.DataBase;
import src.models.texts.Book;
import src.usecases.book.DeleteBookUseCase;
import src.usecases.book.ShowAllBooksUseCase;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

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
        new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        System.out.println();
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
