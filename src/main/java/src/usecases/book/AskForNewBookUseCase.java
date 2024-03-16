package src.usecases.book;

import src.models.texts.Book;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class AskForNewBookUseCase {
    public Book execute(Scanner scanner) {
        String title, author, knowledgeArea;
        int quantity, pages;
        System.out.println();
        System.out.println("Agregando libro >>");
        System.out.println();
        title = new PromptForStringInputUseCase().execute("Título de la libro: ", scanner);
        System.out.println();
        author = new PromptForStringInputUseCase().execute("Autor de la libro: ", scanner);
        System.out.println();
        knowledgeArea = new PromptForStringInputUseCase().execute("Área del conocimiento: ", scanner);
        System.out.println();
        quantity = new PromptForIntegerInputUseCase().execute("Cantidad de la libro a ingresar: ", scanner);
        System.out.println();
        pages = new PromptForIntegerInputUseCase().execute("Páginas: ", scanner);
        System.out.println();
        return new Book(title, author, quantity, knowledgeArea, pages);
    }
}
