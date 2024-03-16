package src.usecases.ui.menu;

import src.usecases.book.ShowAllAvailableBooksToBorrow;
import src.usecases.interfaces.IUseCase;
import src.usecases.loan.AddBookLoanUseCase;

public class ShowBooksAvailableToBorrowMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        System.out.println();
        System.out.println("Mostrando libros disponibles para préstamo >>");
        System.out.println();
        new ShowAllAvailableBooksToBorrow().execute();
        System.out.println();
        new AddBookLoanUseCase().execute();
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
