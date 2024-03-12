package src.usecases.novel;

import src.models.texts.Novel;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class AskForUpdateNewNovelUseCase {
    public Novel execute(Novel outDatedNovel, Scanner scanner){
        String title, author, genre;
        int quantity, suggestedReadingAge;
        System.out.println("Actualizando Novela >>");
        System.out.println();
        System.out.println("Titulo actual: " + outDatedNovel.getTitle());
        title = new PromptForStringInputUseCase().execute("Nuevo titulo: ", scanner);
        System.out.println();
        System.out.println("Autor actual: " + outDatedNovel.getAuthor());
        author = new PromptForStringInputUseCase().execute("Nuevo autor: ", scanner);
        System.out.println();
        System.out.println("Género actual: " + outDatedNovel.getGenre());
        genre = new PromptForStringInputUseCase().execute("Nueva género: ", scanner);
        System.out.println();
        System.out.println("Cantidad agregada: " + outDatedNovel.getQuantity());
        quantity = new PromptForIntegerInputUseCase().execute("Nueva cantidad: ", scanner);
        System.out.println();
        System.out.println("Edad recomendada de lectura actual: " + outDatedNovel.getSuggestedReadingAge());
        suggestedReadingAge = new PromptForIntegerInputUseCase().execute("Nueva edad recomendada de lectura: ", scanner);
        System.out.println();
        return new Novel(title, author, quantity, genre, suggestedReadingAge);
    }
}
