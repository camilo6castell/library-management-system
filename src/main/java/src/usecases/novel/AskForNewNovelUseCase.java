package src.usecases.novel;

import src.models.texts.Novel;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsValidQuantity;

import java.util.Scanner;

public class AskForNewNovelUseCase {
    public Novel execute(Scanner scanner) {
        String title, author, genre;
        int quantity, suggestedReadingAge;
        System.out.println();
        System.out.println("Agregando novela >>");
        System.out.println();
        title = new PromptForStringInputUseCase().execute("Título de la novela: ", scanner);
        System.out.println();
        author = new PromptForStringInputUseCase().execute("Autor de la novela: ", scanner);
        System.out.println();
        genre = new PromptForStringInputUseCase().execute("Género: ", scanner);
        System.out.println();
        quantity = new IsValidQuantity().execute("Cantidad de la novela a ingresar: ", scanner);
        System.out.println();
        suggestedReadingAge = new IsValidQuantity().execute("Edad sugerida de lectura: ", scanner);
        System.out.println();
        return new Novel(title, author, quantity, genre, suggestedReadingAge);
    }
}
