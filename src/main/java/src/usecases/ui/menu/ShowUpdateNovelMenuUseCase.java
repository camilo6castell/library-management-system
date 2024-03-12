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
        new UpdateNovelUseCase().execute();
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

