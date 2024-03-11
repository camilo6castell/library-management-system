package usecases.book;

import static data.DataBase.libraryBooks;

import data.DataBase;
import models.texts.Book;
import usecases.interfaces.IUseCase;
import usecases.ui.ShowAlertMessageUseCase;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateBookUseCase implements IUseCase<Book, Object> {

    @Override
    public Book execute(Book outdatedBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Actualizando libro >\n");
        System.out.println("Titulo actual: " + outdatedBook.getTitle());
        String title = promptForInput("Nuevo titulo: ", scanner);
        System.out.println("Autor actual: " + outdatedBook.getAuthor());
        String author = promptForInput("Nuevo autor: ", scanner);
        System.out.println("Área de conocimiento actual: " + outdatedBook.getKnowledgeArea());
        String knowledgeArea = promptForInput("Nueva Área de conocimiento: ", scanner);
        System.out.println("Cantidad actual: " + outdatedBook.getQuantity());
        int quantity = promptForIntegerInput("Nueva cantidad: ", scanner);
        System.out.println("Cantidad de disponibles para préstamo actual: " + outdatedBook.getAvailable());
        int available = promptForIntegerInput("Nueva cantidad de disponibles para préstamo: ", scanner);
        System.out.println("Cantidad en préstamo actual: " + outdatedBook.getOnLoan());
        int onLoan = promptForIntegerInput("Nueva cantidad de disponibles para préstamo: ", scanner);
        System.out.println("Cantidad de páginas actual: " + outdatedBook.getPages());
        int pages = promptForIntegerInput("Nueva cantidad de páginas: ", scanner);
        return new Book(title, author, quantity, available, onLoan, knowledgeArea, pages);

    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita el número del libro a actualizar: ");
        int outdatedLibraryBookIndex = Integer.parseInt(scanner.nextLine()) - 1;
        System.out.println("\n_______________________________________________________________\n");

        if (outdatedLibraryBookIndex < 0 || outdatedLibraryBookIndex >= libraryBooks.size()) {
            System.out.println("El índice del libro a actualizar no existe");
            new ShowAlertMessageUseCase().execute("\n");
            return;
        }
        Book outdatedBook = libraryBooks.get(outdatedLibraryBookIndex);
        Book updatedBook = new UpdateBookUseCase().execute(outdatedBook);
        int index = libraryBooks.indexOf(outdatedBook);
        libraryBooks.set(index, updatedBook);
        System.out.println("El libro ha sido actualizado correctamente.");

    }

    @Override
    public Object execute(Book firstValue, Book secondValue) {
        return null;
    }


    private int promptForIntegerInput(String message, Scanner scanner) {
        System.out.print(message);
        return Integer.parseInt(scanner.nextLine());
    }

    private String promptForInput(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
