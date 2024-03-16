package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.loan.FilterLoansRequiredByEmailUseCase;
import src.usecases.loan.MarkLoanAsDoneUseCase;

import java.util.Scanner;

public class SetLoanDoneMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Marcando préstamo como 'Realizado' >>");
        System.out.println();
        System.out.print("Ingrese el email del lector: ");
        String email = scanner.next();
        System.out.println();
        new FilterLoansRequiredByEmailUseCase().execute(email);
        System.out.println();
        new MarkLoanAsDoneUseCase().execute();
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
