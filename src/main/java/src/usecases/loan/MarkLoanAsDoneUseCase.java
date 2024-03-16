package src.usecases.loan;

import src.models.loans.Loan;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

import static src.data.DataBase.libraryLoans;

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
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        }
        libraryLoans.get(loanToSetDoneIndex).setStatus("Done");
        System.out.println("Prestamos marcado como 'Realizado.");
    }

    @Override
    public Object execute(Loan firstValue, Loan secondValue) {
        return null;
    }
}
