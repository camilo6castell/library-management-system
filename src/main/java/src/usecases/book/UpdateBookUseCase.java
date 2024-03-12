package src.usecases.book;

import static src.data.DataBase.libraryBooks;

import src.models.texts.Book;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class UpdateBookUseCase {

    public Book execute(Book outdatedBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Actualizando libro >>");
        System.out.println();
        System.out.println("Titulo actual: " + outdatedBook.getTitle());
        String title = new PromptForStringInputUseCase().execute("Nuevo titulo: ", scanner);
        System.out.println();
        System.out.println("Autor actual: " + outdatedBook.getAuthor());
        String author = new PromptForStringInputUseCase().execute("Nuevo autor: ", scanner);
        System.out.println();
        System.out.println("Área de conocimiento actual: " + outdatedBook.getKnowledgeArea());
        String knowledgeArea = new PromptForStringInputUseCase().execute("Nueva Área de conocimiento: ", scanner);
        System.out.println();
        System.out.println("Cantidad actual: " + outdatedBook.getQuantity());
        int quantity = new PromptForIntegerInputUseCase().execute("Nueva cantidad: ", scanner);
        System.out.println();
        System.out.println("Cantidad de páginas actual: " + outdatedBook.getPages());
        int pages = new PromptForIntegerInputUseCase().execute("Nueva cantidad de páginas: ", scanner);
        System.out.println();
        return new Book(title, author, quantity, knowledgeArea, pages);

    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita el número del libro a actualizar: ");
        int outdatedLibraryBookIndex = Integer.parseInt(scanner.nextLine()) - 1;
        System.out.println("\n_______________________________________________________________\n");

        if (outdatedLibraryBookIndex < 0 || outdatedLibraryBookIndex >= libraryBooks.size()) {
            System.out.println("El índice del libro a actualizar no existe");
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
            System.out.println();
            return;
        }
        Book outdatedBook = libraryBooks.get(outdatedLibraryBookIndex);
        Book updatedBook = new UpdateBookUseCase().execute(outdatedBook);
        int index = libraryBooks.indexOf(outdatedBook);
        libraryBooks.set(index, updatedBook);
        System.out.println("El libro ha sido actualizado correctamente.");

    }
}
