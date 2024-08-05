package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.ui.ExitProgramUseCase;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsValidMenuOption;

import java.util.HashMap;
import java.util.Scanner;

public class ShowAssistantMenuUseCase implements IUseCase<Object, Object> {

    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, IUseCase<Object, Object>> assistantMenuUseCases = new HashMap<>();
        assistantMenuUseCases.put(1, new ShowAddBookOrNovelMenuUseCase());
        assistantMenuUseCases.put(2, new ShowUpdateBookOrNovelMenuUseCase());
        assistantMenuUseCases.put(3, new ShowDeleteBookOrNovelMenuUseCase());
        assistantMenuUseCases.put(4, new ShowAllBooksOrNovelsUseCase());
        assistantMenuUseCases.put(5, new ShowAllBooksAndNovelsMenuUseCase());
        assistantMenuUseCases.put(6, new SetLoanDoneMenuUseCase());
        assistantMenuUseCases.put(7, new SetLoanFinalizedMenuUseCase());
        assistantMenuUseCases.put(8, new ShowMainMenuUseCase());
        assistantMenuUseCases.put(0, new ExitProgramUseCase());
        do {
            Integer chosenOption = new PromptForIntegerInputUseCase().execute("""
                    _______________________________________________________________

                    Bienvenido asistente
                                                        
                    ¿Qué deseas hacer?
                                                        
                    1 Agregar libro o novela
                    2 Actualizar libro o novela
                    3 Eliminar libro o novela
                    4 Mostrar libros o novelas en sistema
                    5 Mostrar libros y novelas en el sistema
                                                        
                    6 Marcar préstamo como 'Realizado'
                    7 Marcar préstamo como 'Finalizado'
                    
                    8 Cerrar sesión
                    0 Terminar programa
                    
                    Digite el número de la opción deseada:\s""", scanner);
            if (IsValidMenuOption.execute(chosenOption, 8)) {
                assistantMenuUseCases.get(chosenOption).execute();
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
