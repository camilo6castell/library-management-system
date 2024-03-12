package src.usecases.ui.menu;


import src.usecases.interfaces.IUseCase;
import src.usecases.loan.AddNovelLoanUseCase;
import src.usecases.novel.ShowAllAvailableNovelsToBorrow;

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
