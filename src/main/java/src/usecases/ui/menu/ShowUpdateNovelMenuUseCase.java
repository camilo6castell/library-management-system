package src.usecases.ui.menu;

import static src.data.DataBase.libraryNovels;

import src.models.texts.Novel;
import src.usecases.novel.AskForUpdateNewNovelUseCase;
import src.usecases.novel.ShowAllNovelsUseCase;
import src.usecases.novel.UpdateNovelUseCase;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class ShowUpdateNovelMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                _______________________________________________________________

                Actualizando Novela >>
                            
                Elija la novela que desea actualizar
                
                """);
        new ShowAllNovelsUseCase().execute();
        System.out.println();
        int libraryNovelIndex = new PromptForIntegerInputUseCase().execute("Digita el número de la novela a actualizar: ", scanner);
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
        Novel outDatedNovel = libraryNovels.get(libraryNovelIndex - 1);
        new UpdateNovelUseCase().execute(outDatedNovel, new AskForUpdateNewNovelUseCase().execute(outDatedNovel, scanner));
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

