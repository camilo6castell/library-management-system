package src.usecases.novel;

import static src.data.DataBase.libraryNovels;
import src.models.texts.Novel;

import java.util.Scanner;

public class AddNovelUseCase {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Novel newNovel = new AskForNewNovelUseCase().execute(scanner);
        if (libraryNovels.stream().anyMatch(object -> object.getTitle().equals(newNovel.getTitle()))) {
            System.out.println("La novela con el título " + newNovel.getTitle() + " ya se encuentra en nuestro registro. " +
                    "La novela no se agregará a la biblioteca.\n");
        } else {
            libraryNovels.add(newNovel);
            System.out.println("La novela con el título " + newNovel.getTitle() + " ha sido agregado a nuestra biblioteca.\n");
        }
    }
}
