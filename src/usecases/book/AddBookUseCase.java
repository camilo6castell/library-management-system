package usecases.book;

import models.texts.Book;
import usecases.interfaces.IUseCase;

import java.util.ArrayList;
import java.util.Scanner;

import static data.DataBase.libraryBooks;

public class AddBookUseCase implements IUseCase<Object, Object> {

    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String title, author, knowledgeArea;
        int quantity, available, onLoan, pages;
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
        boolean isBook = libraryBooks.stream().anyMatch(object -> object.getTitle().equals(title));
        if (isBook) {
            System.out.println("El libro con el título " + title + " ya se encuentra en nuestro registro. El libro " +
                    "no se agregará a la biblioteca.");
        } else {
            libraryBooks.add(new Book(title, author, quantity, available, onLoan, knowledgeArea, pages));
            System.out.println("El libro con el título " + title + " ha sido agregado a nuestra biblioteca.");
        }
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}


