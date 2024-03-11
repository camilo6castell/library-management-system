package usecases.ui;

import data.DataBase;
import usecases.book.AddBookUseCase;
import usecases.interfaces.IUseCase;

import java.util.Scanner;

public class ShowAddBookMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public void execute() {
        new AddBookUseCase().execute();
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
