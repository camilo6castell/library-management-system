package src.usecases.novel;

import static src.data.DataBase.libraryNovels;

import src.models.texts.Novel;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsValidQuantity;

import java.util.Scanner;

public class UpdateNovelUseCase {

    public Novel execute(Novel outdatedNovel, Scanner scanner) {
        System.out.println("Actualizando Novela >>");
        System.out.println();
        System.out.println("Titulo actual: " + outdatedNovel.getTitle());
        outdatedNovel.setTitle(new PromptForStringInputUseCase().execute("Nuevo titulo: ", scanner));
        System.out.println();
        System.out.println("Autor actual: " + outdatedNovel.getAuthor());
        outdatedNovel.setAuthor(new PromptForStringInputUseCase().execute("Nuevo autor: ", scanner));
        System.out.println();
        System.out.println("Género de la novela actual: " + outdatedNovel.getGenre());
        outdatedNovel.setGenre(new PromptForStringInputUseCase().execute("Nueva género de la novela: ", scanner));
        System.out.println();
        System.out.println("Cantidad actual: " + outdatedNovel.getQuantity());
        outdatedNovel.setQuantity(new IsValidQuantity().execute("Nueva cantidad: ", scanner));
        System.out.println();
        System.out.println("Edad sugerida de lectura actual: " + outdatedNovel.getSuggestedReadingAge());
        outdatedNovel.setSuggestedReadingAge(new IsValidQuantity().execute("Nueva edad sugerida de lectura: ", scanner));
        System.out.println();
        return outdatedNovel;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita el número de la novela a actualizar: ");
        int selectedIndex = Integer.parseInt(scanner.nextLine()) - 1;
        System.out.println("\n_______________________________________________________________\n");

        if (selectedIndex < 0 || selectedIndex >= libraryNovels.size()) {
            System.out.println("El índice de la novela a actualizar no existe");
            new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
            System.out.println();
        } else {

            // CLONED NOVEL

            Novel clonedNovel = libraryNovels.get(selectedIndex).clone();

            //

            Novel updatedNovel = new UpdateNovelUseCase().execute(clonedNovel, scanner);
            libraryNovels.set(selectedIndex, updatedNovel);
            System.out.println("El libro ha sido actualizado correctamente.");
        }
    }
}
