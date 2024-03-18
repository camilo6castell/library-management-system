package src.usecases.loan;

import src.models.loans.Loan;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

import static src.data.DataBase.libraryLoans;

public class FilterLoansDoneByEmailUseCase {

    public boolean execute() {
        Scanner scanner = new Scanner(System.in);
        String email = new PromptForStringInputUseCase().execute("Ingrese el email del lector: ", scanner);
        System.out.println();
        int items = 0;
        for (Loan loan : libraryLoans){
            if (loan.getEmail().equals(email) && loan.getStatus().equals("Done")){
                System.out.format("%d - Título: %s - Estado: Realizado\n", libraryLoans.indexOf(loan) + 1, loan.getTitle());
                items += 1;
            }
        }
        return items == 0;
    }
}
