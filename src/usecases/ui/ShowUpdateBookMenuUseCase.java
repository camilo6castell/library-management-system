package usecases.ui;

import data.DataBase;
import models.texts.Book;
import usecases.book.ShowAllBooksUseCase;
import usecases.book.UpdateBookUseCase;
import usecases.interfaces.IUseCase;

import java.util.Scanner;

public class ShowUpdateBookMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String title, author, knowledgeArea;
        int quantity, available, onLoan, pages;
        System.out.println("""
                _______________________________________________________________

                Actualizando libro >>
                            
                Elija el libro que desea actualizar
                
                """);
        new ShowAllBooksUseCase().execute();
        System.out.println();
        System.out.print("Digita el número del libro a actualizar: ");
        int libraryBookIndex = Integer.parseInt(scanner.next());
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
        Book outDatedBook = DataBase.libraryBooks.get(libraryBookIndex - 1);
        System.out.println("Actualizando libro >");
        System.out.println();
        System.out.println("Titulo actual: " + outDatedBook.getTitle());
        System.out.print("Nuevo titulo: ");
        title = scanner.next();
        System.out.println("Autor actual: " + outDatedBook.getAuthor());
        System.out.print("Nuevo autor: ");
        author = scanner.next();
        System.out.println("Área de conocimiento actual: " + outDatedBook.getKnowledgeArea());
        System.out.print("Nueva Área de conocimiento: ");
        knowledgeArea = scanner.next();
        System.out.println("Cantidad actual: " + outDatedBook.getQuantity());
        System.out.print("Nueva cantidad: ");
        quantity = Integer.parseInt(scanner.next());
        System.out.println("Cantidad de disponibles para préstamo actual: " + outDatedBook.getAvailable());
        System.out.print("Nueva cantidad de disponibles para préstamo: ");
        available = Integer.parseInt(scanner.next());
        System.out.println("Cantidad en préstamo actual: " + outDatedBook.getOnLoan());
        System.out.print("Nueva cantidad de disponibles para préstamo: ");
        onLoan = Integer.parseInt(scanner.next());
        System.out.println("Cantidad de páginas actual: " + outDatedBook.getPages());
        System.out.print("Nueva cantidad de páginas: ");
        pages = Integer.parseInt(scanner.next());
        Book upDatedBook = new Book(title, author, quantity, available, onLoan, knowledgeArea, pages);
        new UpdateBookUseCase().execute(DataBase.libraryBooks, outDatedBook, upDatedBook);
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
