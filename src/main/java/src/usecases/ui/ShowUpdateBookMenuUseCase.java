package usecases.ui;

import data.DataBase;
import models.texts.Book;
import usecases.book.ShowAllBooksUseCase;
import usecases.book.UpdateBookUseCase;
import usecases.interfaces.IUseCase;

import java.util.Scanner;

public class ShowUpdateBookMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public void execute() {
        System.out.println("""
                _______________________________________________________________

                Actualizando libro >>
                            
                Elija el libro que desea actualizar
                
                """);
        new ShowAllBooksUseCase().execute();
        new UpdateBookUseCase().execute();
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
