package src.usecases.loan;

import static src.data.DataBase.libraryLoans;
import static src.data.DataBase.libraryBooks;
import static src.data.DataBase.session;


import src.models.loans.Loan;
import src.models.texts.Book;

import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsValidQuantity;

import java.util.Scanner;

public class AddBookLoanUseCase {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int bookIndexToLoan;
        do {
            bookIndexToLoan = new IsValidQuantity().execute("Ingrese el número del libro a pedir en préstamo: ", scanner);
        } while (bookIndexToLoan > libraryBooks.size());
        Book bookToBorrow = libraryBooks.get( bookIndexToLoan - 1);
        libraryLoans.add(new Loan(session.getEmail(), bookToBorrow.getTitle(), bookToBorrow.getAuthor()));
        System.out.println();
        new PromptForStringInputUseCase().execute("""
                _______________________________________________________________

                Prestamo iniciado en estado 'Requerido'.
                Recuerda acercarte a un asistente para que te entregue
                el material solicitado.
                                        
                Ingresa cualquier valor para continuar:\s""", scanner);
        System.out.println();
    }


}
