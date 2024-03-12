package src.usecases.novel;

import static src.data.DataBase.libraryNovels;
import src.models.texts.Novel;

public class AddNovelUseCase {
    public void execute() {
        Novel newNovel = new AskForNewNovelUseCase().execute();
        if (libraryNovels.stream().anyMatch(object -> object.getTitle().equals(newNovel.getTitle()))) {
            System.out.println("La novela con el título " + newNovel.getTitle() + " ya se encuentra en nuestro registro. " +
                    "La novela no se agregará a la biblioteca.");
        } else {
            libraryNovels.add(newNovel);
            System.out.println("La novela con el título " + newNovel.getTitle() + " ha sido agregado a nuestra biblioteca.");
        }
    }
}
