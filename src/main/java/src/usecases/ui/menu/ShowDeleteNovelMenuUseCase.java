package src.usecases.ui.menu;

import src.data.DataBase;
import src.models.texts.Novel;
import src.usecases.interfaces.IUseCase;
import src.usecases.novel.DeleteNovelUseCase;
import src.usecases.novel.ShowAllNovelsUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

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
        new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        System.out.println();
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
