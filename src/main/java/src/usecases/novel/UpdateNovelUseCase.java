package src.usecases.novel;

import static src.data.DataBase.libraryNovels;
import src.models.texts.Novel;

public class UpdateNovelUseCase {

    public void execute(Novel outDatedNovel, Novel upDatedNovel) {
        int index = libraryNovels.indexOf(outDatedNovel);
        if (index == -1) {
            System.out.println("La novela que quieres actualizar no está registrada.");
        } else {
            libraryNovels.set(index, upDatedNovel);
            System.out.println("El novela ha sido actualizado correctamente.");
        }
    }
}
