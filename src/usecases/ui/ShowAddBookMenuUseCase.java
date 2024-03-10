package usecases.ui;

import data.DataBase;
import usecases.book.AddBookUseCase;
import usecases.interfaces.IUseCase;

import java.util.Scanner;

public class ShowAddBookMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String title, author, knowledgeArea;
        int quantity, available, onLoan, pages;
        System.out.println();
        System.out.println();
        System.out.println("Agregando libro >");
        System.out.println();
        System.out.print("Título del libro: ");
        title = scanner.nextLine();
        System.out.println();
        System.out.print("Autor del libro: ");
        author = scanner.nextLine();
        System.out.println();
        System.out.print("Área del conocimiento: ");
        knowledgeArea = scanner.nextLine();
        System.out.println();
        System.out.print("Cantidad del libro a ingresar: ");
        quantity = scanner.nextInt();
        available = quantity;
        onLoan = 0;
        System.out.print("Número de páginas: ");
        pages = scanner.nextInt();
        new AddBookUseCase().execute(DataBase.libraryBooks, title, author, quantity, available,
                onLoan, knowledgeArea, pages);
        new ShowAlertMessageUseCase().execute("\n");
    }
    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }

    @Override
    public Object execute(Object value) {
        return null;
    }
}
