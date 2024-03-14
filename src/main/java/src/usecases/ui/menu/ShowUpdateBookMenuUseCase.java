package src.usecases.ui.menu;

import src.usecases.book.ShowAllBooksUseCase;
import src.usecases.book.UpdateBookUseCase;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class ShowUpdateBookMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                _______________________________________________________________

                Actualizando libro >>
                            
                Lista de libros
                """);
        new ShowAllBooksUseCase().execute();
        new UpdateBookUseCase().execute();
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
