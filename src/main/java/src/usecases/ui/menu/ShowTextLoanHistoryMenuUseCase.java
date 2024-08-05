package src.usecases.ui.menu;

import static src.data.DataBase.libraryLoans;
import static src.data.DataBase.session;

import src.models.loans.Loan;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class ShowTextLoanHistoryMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Lista de préstamos:");
        System.out.println();
        for (Loan loan : libraryLoans){
            if (loan.getEmail().equals(session.getEmail())){
                System.out.format("     %d - Titulo: %s - Fecha de creación: %s - Estado: %s\n", libraryLoans.indexOf(loan) + 1,
                        loan.getTitle(), loan.getCreationDate(), loan.getStatus());
            }
        }
        System.out.println();
        new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        System.out.println();
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
