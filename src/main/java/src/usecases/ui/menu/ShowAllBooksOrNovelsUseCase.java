package src.usecases.ui.menu;

import src.data.DataBase;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.*;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsValidMenuOption;

import java.util.HashMap;
import java.util.Scanner;

public class ShowAllBooksOrNovelsUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, IUseCase<Object, Object>> showAllBooksOrNovelsUseCases = new HashMap<>();
        showAllBooksOrNovelsUseCases.put(1, new ShowAllBooksMenuUseCase());
        showAllBooksOrNovelsUseCases.put(2, new ShowAllNovelsMenuUseCase());
        showAllBooksOrNovelsUseCases.put(3, DataBase.session.getClass().getSimpleName().equals("Administrator") ? new ShowAdministratorMenuUseCase() : new ShowAssistantMenuUseCase());
        showAllBooksOrNovelsUseCases.put(0, new ExitProgramUseCase());
        do {
            Integer chosenOption = new PromptForIntegerInputUseCase().execute("""
                     _______________________________________________________________

                    Mostrar libros o novelas
                                
                    ¿Qué deseas ver?
                                
                    1 Ver libros
                    2 Ver novelas
                                
                    3 Ir al menú de atrás
                    0 Terminar programa
                    
                    Digite el número de la opción deseada:\s""", scanner);
            if (IsValidMenuOption.execute(chosenOption, 3)) {
                showAllBooksOrNovelsUseCases.get(chosenOption).execute();
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