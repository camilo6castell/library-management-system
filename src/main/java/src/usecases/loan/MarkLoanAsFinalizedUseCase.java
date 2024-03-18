package src.usecases.loan;

import src.models.loans.Loan;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsLoanOnTime;

import java.time.LocalDate;
import java.util.Scanner;

import static src.data.DataBase.libraryLoans;

public class MarkLoanAsFinalizedUseCase implements IUseCase<Loan, Object> {
    @Override
    public Loan execute(Loan value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Integer loanToSetFinalizedIndex = new PromptForIntegerInputUseCase().execute("Ingrese el número del préstamo a marcar como 'Finalizado': ", scanner);
        if (loanToSetFinalizedIndex == null){
            System.out.println();
            System.out.println("Valor no permitido. Operación cancelada.");
            System.out.println();
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        } else if (loanToSetFinalizedIndex < 0 || loanToSetFinalizedIndex > libraryLoans.size()) {
            System.out.println("El libro que escogiste para actualizar no existe");
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        } else {
            loanToSetFinalizedIndex -= 1;

            libraryLoans.get(loanToSetFinalizedIndex).setStatus("Finalized");
            libraryLoans.get(loanToSetFinalizedIndex).setFinishDate(LocalDate.now());

            new IsLoanOnTime().execute(libraryLoans.get(loanToSetFinalizedIndex).getCreationDate(), libraryLoans.get(loanToSetFinalizedIndex).getFinishDate());
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        }
    }

    @Override
    public Object execute(Loan firstValue, Loan secondValue) {
        return null;
    }
}
