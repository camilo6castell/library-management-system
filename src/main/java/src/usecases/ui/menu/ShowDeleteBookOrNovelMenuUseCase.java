package src.usecases.ui.menu;

import src.data.DataBase;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.*;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsValidMenuOption;

import java.util.HashMap;
import java.util.Scanner;

public class ShowDeleteBookOrNovelMenuUseCase implements IUseCase<Object, Object>{
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, IUseCase<Object, Object>> updateBookOrNovelUseCases = new HashMap<>();
        updateBookOrNovelUseCases.put(1, new ShowDeleteBookMenuUseCase());
        updateBookOrNovelUseCases.put(2, new ShowDeleteNovelMenuUseCase());
        updateBookOrNovelUseCases.put(3, DataBase.session.getClass().getSimpleName().equals("Administrator") ? new ShowAdministratorMenuUseCase() : new ShowAssistantMenuUseCase());
        updateBookOrNovelUseCases.put(0, new ExitProgramUseCase());
        do {
            Integer choseOption = new PromptForIntegerInputUseCase().execute("""
                    _______________________________________________________________

                    Eliminar libro o novela
                                
                    ¿Qué deseas eliminar?
                                
                    1 Eliminar libro
                    2 Eliminar novela
                                
                    3 Ir al menú de atrás
                    0 Terminar programa
                    
                    Digite el número de la opción deseada:\s""", scanner);
            if (IsValidMenuOption.execute(choseOption, 3)) {
                updateBookOrNovelUseCases.get(choseOption).execute();
            } else {
                new PromptForStringInputUseCase().execute("""
                        _______________________________________________________________

                        Ha ingreso un valor incorrecto. El valor debe estar entre las
                        opciones mostradas.
                        
                        Ingresa cualquier valor para volver a intentarlo:\s""", scanner);
            }
        } while (true);
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}

