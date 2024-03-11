package usecases.ui;

import static data.DataBase.libraryLoans;
import static data.DataBase.readerSession;

import models.loans.Loan;
import usecases.interfaces.IUseCase;

public class ShowTextLoanHistoryMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        System.out.println();
        System.out.println("Lista de préstamos:");
        System.out.println();
        for (Loan loan : libraryLoans){
            if (loan.getEmail().equals(readerSession.getEmail())){
                System.out.format("     %d - Titulo: %s - Fecha de creación: %s - Estado: %s", libraryLoans.indexOf(loan) + 1,
                        loan.getTitle(), loan.getCreationDate(), loan.getStatus());
            }
        }
        new ShowAlertMessageUseCase().execute("\n");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
