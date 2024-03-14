package src.usecases.book;

import static src.data.DataBase.libraryBooks;

import src.models.texts.Book;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class UpdateBookUseCase {

    public Book execute(Book clonedBook, Scanner scanner) {
        System.out.println("Actualizando libro >>");
        System.out.println();
        System.out.println("Titulo actual: " + clonedBook.getTitle());
        clonedBook.setTitle(new PromptForStringInputUseCase().execute("Nuevo titulo: ", scanner));
        System.out.println();
        System.out.println("Autor actual: " + clonedBook.getAuthor());
        clonedBook.setAuthor(new PromptForStringInputUseCase().execute("Nuevo autor: ", scanner));
        System.out.println();
        System.out.println("Área de conocimiento actual: " + clonedBook.getKnowledgeArea());
        clonedBook.setKnowledgeArea(new PromptForStringInputUseCase().execute("Nueva Área de conocimiento: ", scanner));
        System.out.println();
        System.out.println("Cantidad actual: " + clonedBook.getQuantity());
        clonedBook.setQuantity(new PromptForIntegerInputUseCase().execute("Nueva cantidad: ", scanner));
        System.out.println();
        System.out.println("Cantidad de páginas actual: " + clonedBook.getPages());
        clonedBook.setPages(new PromptForIntegerInputUseCase().execute("Nueva cantidad de páginas: ", scanner));
        System.out.println();
        return clonedBook;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Digita el número del libro a actualizar: ");
        int selectedIndex = Integer.parseInt(scanner.nextLine()) - 1;
        System.out.println("\n_______________________________________________________________\n");

        if (selectedIndex < 0 || selectedIndex >= libraryBooks.size()) {
            System.out.println("El índice del libro a actualizar no existe\n");
            System.out.println();
        } else {

            // CLONED BOOK

            Book clonedBook = libraryBooks.get(selectedIndex).clone();

            //

            Book updatedBook = new UpdateBookUseCase().execute(clonedBook, scanner);
            libraryBooks.set(selectedIndex, updatedBook);
            System.out.println("El libro ha sido actualizado correctamente.\n");
        }
    }
}
