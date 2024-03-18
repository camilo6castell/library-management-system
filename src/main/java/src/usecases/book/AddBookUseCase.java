package src.usecases.book;

import src.models.texts.Book;

import java.util.Scanner;

import static src.data.DataBase.libraryBooks;

public class AddBookUseCase {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Book newBook = new AskForNewBookUseCase().execute(scanner);
        if (libraryBooks.stream().anyMatch(object -> object.getTitle().equals(newBook.getTitle()))) {
            System.out.println("El libro con el título " + newBook.getTitle() + " ya se encuentra en nuestro registro." +
                    " El libro no se agregará a la biblioteca.\n");
        } else {
            libraryBooks.add(newBook);
            System.out.println("El libro con el título " + newBook.getTitle() + " ha sido agregado a nuestra biblioteca.\n");
        }
    }
}


