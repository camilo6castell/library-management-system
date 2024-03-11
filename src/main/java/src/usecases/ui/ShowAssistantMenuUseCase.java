package usecases.ui;

import usecases.interfaces.IUseCase;
import validations.Option;

import java.util.HashMap;

public class ShowAssistantMenuUseCase implements IUseCase<Object, Object> {

    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        HashMap<Integer, IUseCase> assistantMenuUseCases = new HashMap<>();
        assistantMenuUseCases.put(1, new ShowAddBookOrNovelMenuUseCase());
        assistantMenuUseCases.put(2, new ShowUpdateBookOrNovelMenuUseCase());
        assistantMenuUseCases.put(3, new ShowDeleteBookOrNovelMenuUseCase());
        assistantMenuUseCases.put(4, new ShowAllBooksOrNovelsUseCase());
        assistantMenuUseCases.put(5, new ShowAllBooksAndNovelsMenuUseCase());
        assistantMenuUseCases.put(6, new AddAssistantMenuUseCase());
        assistantMenuUseCases.put(7, new SetLoanDoneMenuUseCase());
        assistantMenuUseCases.put(8, new SetLoanFinalizedMenuUseCase());
        assistantMenuUseCases.put(9, new ShowMainMenuUseCase());
        assistantMenuUseCases.put(0, new ExitProgramUseCase());
        do {
            String option = new AskOptionMenuUseCase().execute("""
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
                                                        
                    """);
            if (Option.isValid(option, 8)) {
                int validatedOption = Integer.parseInt(option);
                assistantMenuUseCases.get(validatedOption).execute();
            } else {
                new ShowAlertMessageUseCase().execute("""
                    _______________________________________________________________


                    Ha ingreso un valor incorrecto. El valor debe estar entre las
                    opciones mostradas.
                    
                    """);
            }
        } while (true);
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
