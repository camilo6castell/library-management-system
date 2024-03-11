package usecases.novel;

import models.texts.Novel;
import usecases.interfaces.IUseCase;

import static data.DataBase.libraryNovels;

public class ShowAllAvailableNovelsToBorrow implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        for (Novel novel : libraryNovels){
            if (novel.getAvailable() > 0){
                System.out.format("%d - Título: %s - Autor: %s - Género: %s -  Edad sugerida de lectura: %d\n",
                        libraryNovels.indexOf(novel) + 1, novel.getTitle(),  novel.getAuthor(),
                        novel.getGenre(), novel.getSuggestedReadingAge());
            }
        }
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
