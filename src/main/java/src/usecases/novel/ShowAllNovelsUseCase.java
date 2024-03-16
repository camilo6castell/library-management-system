package src.usecases.novel;

import src.data.DataBase;
import src.models.texts.Novel;
import src.usecases.interfaces.TextUseCase;

public class ShowAllNovelsUseCase implements TextUseCase<Object, Object, Object> {
    @Override
    public void execute() {
        for (int i = 0; i < DataBase.libraryNovels.size(); i++) {
            Novel novel = DataBase.libraryNovels.get(i);
            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, novel.getTitle(), novel.getAuthor());
        }
    }

    @Override
    public void execute(Object valueA, Object valueB) {

    }

    @Override
    public Object execute(Object valueA, Object valueB, Object valueBB) {
        return null;
    }

    @Override
    public Object execute(Object valueA, Object valueB, Object valueBB, Object valueC, Object valueCC, Object valueCCCC, Object valueBBB, Object valueCCC) {
        return null;
    }
}
