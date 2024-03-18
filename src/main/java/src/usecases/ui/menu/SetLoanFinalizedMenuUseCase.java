package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.loan.FilterLoansDoneByEmailUseCase;
import src.usecases.loan.MarkLoanAsFinalizedUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class SetLoanFinalizedMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Marcando préstamo como 'Finalizado' >>");
        System.out.println();
        if (new FilterLoansDoneByEmailUseCase().execute()){
            System.out.println("No hay registros de prestamos esperando a ser finalizados para este usuario.\n");
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        } else {
            System.out.println();
            new MarkLoanAsFinalizedUseCase().execute();
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
