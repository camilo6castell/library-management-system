package src.usecases.loan;


import src.models.loans.Loan;
import src.models.texts.Novel;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsValidQuantity;

import java.util.Scanner;

import static src.data.DataBase.*;

public class AddNovelLoanUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int novelIndexToLoan;
        do {
            novelIndexToLoan = new IsValidQuantity().execute("Ingrese el número del libro a pedir en préstamo: ", scanner);
        } while (novelIndexToLoan > libraryNovels.size());
        Novel novelToBorrow = libraryNovels.get( novelIndexToLoan - 1);
        libraryLoans.add(new Loan(session.getEmail(), novelToBorrow.getTitle(), novelToBorrow.getAuthor()));
        System.out.println();
        new PromptForStringInputUseCase().execute("""
                _______________________________________________________________


                Prestamo iniciado en estado 'Requerido'.
                Recuerda acercarte a un asistente para que te entregue
                el material solicitado.
                                        
                Ingresa cualquier valor para continuar:\s""", scanner);
        System.out.println();
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
