package src.usecases.loan;

import src.models.loans.Loan;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

import static src.data.DataBase.libraryLoans;

public class FilterLoansDoneByEmailUseCase {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String email = new PromptForStringInputUseCase().execute("Ingrese el email del lector: ", scanner);
        System.out.println();
        for (Loan loan : libraryLoans){
            if (loan.getEmail().equals(email) && loan.getStatus().equals("Done")){
                System.out.format("%d - Título: %s - Estado: Realizado\n", libraryLoans.indexOf(loan) + 1, loan.getTitle());
            }
        }
    }
}
