package usecases.novel;

import models.texts.Novel;
import usecases.interfaces.TextUseCase;

import java.util.ArrayList;

public class UpdateNovelUseCase implements TextUseCase<ArrayList<Novel>, Novel, Novel> {
    @Override
    public ArrayList<Novel> execute(ArrayList<Novel> libraryNovels, Novel outDatedNovel, Novel upDatedNovel) {
        int index = libraryNovels.indexOf(outDatedNovel);
        if (index == -1) {
            System.out.println("La novela que quieres actualizar no está registrada.");
        } else {
            libraryNovels.set(index, upDatedNovel);
            System.out.println("El novela ha sido actualizado correctamente.");
        }
        return null;
    }

    @Override
    public ArrayList<Novel> execute(ArrayList<Novel> valueA, Novel valueB, Novel valueBB, Novel valueC, Novel valueCC, Novel valueCCCC, Novel valueBBB, Novel valueCCC) {
        return null;
    }

    @Override
    public void execute() {}
}
