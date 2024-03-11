package usecases.loan;

import models.loans.Loan;
import usecases.interfaces.IUseCase;
import usecases.ui.ShowAlertMessageUseCase;

import java.util.Scanner;

import static data.DataBase.libraryLoans;

public class MarkLoanAsDoneUseCase implements IUseCase<Loan, Object> {

    @Override
    public Loan execute(Loan value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del préstamo a marcar como 'Realizado': ");
        int loanToSetDoneIndex = scanner.nextInt() - 1;

        if (loanToSetDoneIndex < 0 || loanToSetDoneIndex >= libraryLoans.size()) {
            System.out.println("El índice del libro a actualizar no existe");
            new ShowAlertMessageUseCase().execute("\n");
        }
        libraryLoans.get(loanToSetDoneIndex).setStatus("Done");
        System.out.println("Prestamos marcado como 'Realizado.");
    }

    @Override
    public Object execute(Loan firstValue, Loan secondValue) {
        return null;
    }
}
