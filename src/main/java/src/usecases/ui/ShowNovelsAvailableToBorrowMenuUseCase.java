package usecases.ui;


import usecases.interfaces.IUseCase;
import usecases.loan.AddNovelLoanUseCase;
import usecases.novel.ShowAllAvailableNovelsToBorrow;

public class ShowNovelsAvailableToBorrowMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        System.out.println();
        System.out.println("Mostrando novelas disponibles para préstamo >>");
        System.out.println();
        new ShowAllAvailableNovelsToBorrow().execute();
        System.out.println();
        new AddNovelLoanUseCase().execute();
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
