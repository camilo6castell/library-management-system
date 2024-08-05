package src.usecases.loan;

import src.models.loans.Loan;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
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
        Integer loanToSetDoneIndex = new PromptForIntegerInputUseCase().execute("Ingrese el número del préstamo a marcar como 'Realizado': ", scanner);

        if (loanToSetDoneIndex == null){
            System.out.println();
            System.out.println("Valor no permitido. Operación cancelada.");
            System.out.println();
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        } else if (loanToSetDoneIndex < 0 || loanToSetDoneIndex > libraryLoans.size()) {
            System.out.println("El libro que escogiste para actualizar no existe");
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        } else {
            loanToSetDoneIndex -= 1;
            libraryLoans.get(loanToSetDoneIndex).setStatus("Done");
            System.out.println("Prestamos marcado como 'Realizado.");
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        }
    }

    @Override
    public Object execute(Loan firstValue, Loan secondValue) {
        return null;
    }
}
