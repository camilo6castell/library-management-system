package src.usecases.loan;

import static src.data.DataBase.libraryLoans;

import src.models.loans.Loan;
import src.usecases.interfaces.IUseCase;

public class FilterLoansRequiredByEmailUseCase implements IUseCase<String, Object> {
    @Override
    public String execute(String email) {
        for (Loan loan : libraryLoans){
            if (loan.getEmail().equals(email) && loan.getStatus().equals("Required")){
                System.out.format("%d - Título: %s - Estado: Requerido\n", libraryLoans.indexOf(loan) + 1, loan.getTitle());
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
