package usecases.ui;

import usecases.interfaces.IUseCase;
import usecases.book.ShowAllBooksUseCase;

public class ShowAllBooksMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute(){
        System.out.println("""
                Lista de libros:
                
                """);
        new ShowAllBooksUseCase().execute();
        new ShowAlertMessageUseCase().execute("\n");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
