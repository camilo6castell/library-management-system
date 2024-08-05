package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.loan.FilterLoansRequiredByEmailUseCase;
import src.usecases.loan.MarkLoanAsDoneUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class SetLoanDoneMenuUseCase implements IUseCase<Object, Object> {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Marcando préstamo como 'Realizado' >>");
        System.out.println();

        if (new FilterLoansRequiredByEmailUseCase().execute()){
            System.out.println("No hay registros de prestamos esperando a ser realizados para este usuario.\n");
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        } else {
            System.out.println();
            new MarkLoanAsDoneUseCase().execute();
        }
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
