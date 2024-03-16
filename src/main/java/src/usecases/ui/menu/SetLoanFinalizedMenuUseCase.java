package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.loan.FilterLoansDoneByEmailUseCase;
import src.usecases.loan.MarkLoanAsDoneUseCase;

public class SetLoanFinalizedMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {        
        System.out.println();
        System.out.println("Marcando préstamo como 'Finalizado' >>");
        System.out.println();        
        new FilterLoansDoneByEmailUseCase().execute();
        System.out.println();
        new MarkLoanAsDoneUseCase().execute();
        return null;
    }

    @Override
    public void execute() {

    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
