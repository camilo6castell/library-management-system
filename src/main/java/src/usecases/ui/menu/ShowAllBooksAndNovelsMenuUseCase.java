package src.usecases.ui.menu;

import src.usecases.book.ShowAllBooksUseCase;
import src.usecases.interfaces.IUseCase;
import src.usecases.novel.ShowAllNovelsUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class ShowAllBooksAndNovelsMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                    
                    Lista de libros:
                    
                """);
        new ShowAllBooksUseCase().execute();
        System.out.println("""
                    
                    Lista de Novelas:
                    
                """);
        new ShowAllNovelsUseCase().execute();
        new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        System.out.println();
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
