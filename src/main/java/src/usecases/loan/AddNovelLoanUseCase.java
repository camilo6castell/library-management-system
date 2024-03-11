package usecases.loan;

import models.loans.Loan;
import models.texts.Novel;
import usecases.interfaces.IUseCase;
import usecases.ui.ShowAlertMessageUseCase;

import java.util.Scanner;

import static data.DataBase.*;

public class AddNovelLoanUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del libro a pedir en préstamo: ");
        Novel novelToBorrow = libraryNovels.get(scanner.nextInt());
        libraryLoans.add(new Loan(readerSession.getEmail(), novelToBorrow.getTitle(), novelToBorrow.getAuthor()));
        System.out.println();
        new ShowAlertMessageUseCase().execute("Prestamos en estado 'Requerido'. Recuerda acercarte a un asistente " +
                "para que te entregue el material solicitado.");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
