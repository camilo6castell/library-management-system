package usecases.loan;

import static data.DataBase.libraryLoans;
import static data.DataBase.libraryBooks;
import static data.DataBase.readerSession;


import models.loans.Loan;
import models.texts.Book;
import usecases.interfaces.IUseCase;
import usecases.ui.ShowAlertMessageUseCase;

import java.util.Scanner;

public class AddBookLoanUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del libro a pedir en préstamo: ");
        Book bookToBorrow = libraryBooks.get(scanner.nextInt());
        libraryLoans.add(new Loan(readerSession.getEmail(), bookToBorrow.getTitle(), bookToBorrow.getAuthor()));
        System.out.println();
        new ShowAlertMessageUseCase().execute("Prestamos en estado 'Requerido'. Recuerda acercarte a un asistente " +
                "para que te entregue el material solicitado.");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
