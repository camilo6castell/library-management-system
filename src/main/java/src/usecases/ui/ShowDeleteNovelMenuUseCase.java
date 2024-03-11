package usecases.ui;

import data.DataBase;
import models.texts.Novel;
import usecases.interfaces.IUseCase;
import usecases.novel.DeleteNovelUseCase;
import usecases.novel.ShowAllNovelsUseCase;

import java.util.Scanner;

public class ShowDeleteNovelMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                _______________________________________________________________

                Eliminando novela >>
                            
                Elije la novela que deseas eliminar
                                
                """);
        new ShowAllNovelsUseCase().execute();
        System.out.println();
        System.out.print("Digita el número de la novela a eliminar: ");
        int libraryNovelIndex = Integer.parseInt(scanner.next());
        Novel toDeleteNovel = DataBase.libraryNovels.get(libraryNovelIndex - 1);
        new DeleteNovelUseCase().execute(DataBase.libraryNovels, toDeleteNovel);
        new ShowAlertMessageUseCase().execute("\n");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }

    @Override
    public Object execute(Object value) {
        return null;
    }
}
