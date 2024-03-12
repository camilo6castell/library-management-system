package src.usecases.novel;

import static src.data.DataBase.libraryNovels;

import src.models.texts.Novel;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class UpdateNovelUseCase {

    public Novel execute(Novel outdatedNovel, Scanner scanner) {
        System.out.println("Actualizando Novela >>");
        System.out.println();
        System.out.println("Titulo actual: " + outdatedNovel.getTitle());
        String title = new PromptForStringInputUseCase().execute("Nuevo titulo: ", scanner);
        System.out.println();
        System.out.println("Autor actual: " + outdatedNovel.getAuthor());
        String author = new PromptForStringInputUseCase().execute("Nuevo autor: ", scanner);
        System.out.println();
        System.out.println("Género de la novela actual: " + outdatedNovel.getGenre());
        String genre = new PromptForStringInputUseCase().execute("Nueva género de la novela: ", scanner);
        System.out.println();
        System.out.println("Cantidad actual: " + outdatedNovel.getQuantity());
        int quantity = new PromptForIntegerInputUseCase().execute("Nueva cantidad: ", scanner);
        System.out.println();
        System.out.println("Edad sugerida de lectura actual: " + outdatedNovel.getSuggestedReadingAge());
        int  suggestedReadingAge = new PromptForIntegerInputUseCase().execute("Nueva edad sugerida de lectura: ", scanner);
        System.out.println();
        return new Novel(title, author, quantity, genre,  suggestedReadingAge);
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita el número de la novela a actualizar: ");
        int outdatedLibraryNovelIndex = Integer.parseInt(scanner.nextLine()) - 1;
        System.out.println("\n_______________________________________________________________\n");

        if (outdatedLibraryNovelIndex < 0 || outdatedLibraryNovelIndex >= libraryNovels.size()) {
            System.out.println("El índice de la nocela a actualizar no existe");
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
            System.out.println();
        } else {
            Novel outdatedNovel = libraryNovels.get(outdatedLibraryNovelIndex);
            Novel updatedNovel = new UpdateNovelUseCase().execute(outdatedNovel, scanner);
            int index = libraryNovels.indexOf(outdatedNovel);
            libraryNovels.set(index, updatedNovel);
            System.out.println("El libro ha sido actualizado correctamente.");
        }
    }
}
