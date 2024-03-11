package usecases.loan;

import models.loans.Loan;
import usecases.interfaces.IUseCase;

import static data.DataBase.libraryLoans;

public class FilterLoansDoneByEmailUseCase implements IUseCase<String, Object> {
    @Override
    public String execute(String email) {
        for (Loan loan : libraryLoans){
            if (loan.getEmail().equals(email) && loan.getStatus().equals("Done")){
                System.out.format("%d - Título: %s - Estado: Realizado\n", libraryLoans.indexOf(loan) + 1, loan.getTitle());
            }
        }
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
