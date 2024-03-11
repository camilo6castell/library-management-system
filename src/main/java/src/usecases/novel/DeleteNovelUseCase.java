package usecases.novel;

import models.texts.Novel;
import usecases.interfaces.TextUseCase;

import java.util.ArrayList;

public class DeleteNovelUseCase implements TextUseCase<ArrayList<Novel>, Novel, Object> {
    public void execute(ArrayList<Novel> libraryNovels, Novel toDeleteNovel) {
        int index = libraryNovels.indexOf(toDeleteNovel);
        if (index == -1) {
            System.out.println("La novela que quieres eliminar no está registrada.");
        } else {
            libraryNovels.remove(index);
            System.out.println("La novela ha sido eliminado correctamente.");
        }
    }

    @Override
    public ArrayList<Novel> execute(ArrayList<Novel> valueA, Novel valueB, Novel valueBB) {
        return null;
    }

    @Override
    public ArrayList<Novel> execute(ArrayList<Novel> valueA, Novel valueB, Novel valueBB, Object valueC, Object valueCC, Object valueCCCC, Novel valueBBB, Object valueCCC) {
        return null;
    }

    @Override
    public void execute() {

    }
}
