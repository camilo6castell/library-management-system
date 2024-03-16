package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.book.ShowAllBooksUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class ShowAllBooksMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Lista de libros:
                
                """);
        new ShowAllBooksUseCase().execute();
        new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
