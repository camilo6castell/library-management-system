package src.usecases.loan;

import static src.data.DataBase.libraryLoans;
import static src.data.DataBase.libraryBooks;
import static src.data.DataBase.readerSession;


import src.models.loans.Loan;
import src.models.texts.Book;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

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
        new PromptForStringInputUseCase().execute("Prestamos en estado 'Requerido'. Recuerda acercarte a un asistente " +
                "para que te entregue el material solicitado.", scanner);
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
