package usecases.ui;

import usecases.interfaces.IUseCase;
import usecases.loan.FilterLoansDoneByEmailUseCase;
import usecases.loan.MarkLoanAsDoneUseCase;

import java.util.Scanner;

public class SetLoanFinalizedMenuUseCase implements IUseCase<String, Object> {
    @Override
    public String execute(String value) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Marcando préstamo como 'Finalizado' >>");
        System.out.println();
        System.out.print("Ingrese el email del lector: ");
        String email = scanner.next();
        System.out.println();
        new FilterLoansDoneByEmailUseCase().execute(email);
        System.out.println();
        new MarkLoanAsDoneUseCase().execute();
        return null;
    }

    @Override
    public void execute() {

    }

    @Override
    public Object execute(String firstValue, String secondValue) {
        return null;
    }
}
