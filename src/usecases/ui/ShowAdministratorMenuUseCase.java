package usecases.ui;

import models.users.Administrator;
import usecases.interfaces.IUseCase;
import validations.Option;


import java.util.HashMap;

public class ShowAdministratorMenuUseCase implements IUseCase<Administrator, Object> {

    @Override
    public Administrator execute(Administrator value) {
        return null;
    }

    @Override
    public void execute() {
        HashMap<Integer, IUseCase> administratorMenuUseCases = new HashMap<>();
        administratorMenuUseCases.put(1, new ShowAddBookOrNovelMenuUseCase());
        administratorMenuUseCases.put(2, new ShowUpdateBookOrNovelMenuUseCase());
        administratorMenuUseCases.put(3, new ShowDeleteBookOrNovelMenuUseCase());
        administratorMenuUseCases.put(4, new ShowAllBooksOrNovelsUseCase());
        administratorMenuUseCases.put(5, new ShowAllBooksAndNovelsMenuUseCase());
        administratorMenuUseCases.put(6, new AddAssistantMenuUseCase());
        administratorMenuUseCases.put(7, new ShowAllReadersMenuUseCase());
        administratorMenuUseCases.put(8, new ShowAllAssistantsMenuUseCase());
        administratorMenuUseCases.put(9, new ShowMainMenuUseCase());
        administratorMenuUseCases.put(0, new ExitProgramUseCase());
        do {
            String option = new AskOptionMenuUseCase().execute("""
                    _______________________________________________________________

                    Bienvenido admin
                                                        
                    ¿Qué deseas hacer?
                                                        
                    1 Agregar libro o novela
                    2 Actualizar libro o novela
                    3 Eliminar libro o novela
                    4 Mostrar libros o novelas en sistema
                    5 Mostrar libros y novelas en el sistema
                                                        
                    6 Agregar asistente
                                                        
                    7 Mostrar listado de lectores
                    8 Mostrar listado de asistentes
                                                        
                    9 Cerrar sesión
                    0 Terminar programa
                                                        
                    """);
            if (Option.isValid(option, 9)) {
                int validatedOption = Integer.parseInt(option);
                administratorMenuUseCases.get(validatedOption).execute();
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
    public Administrator execute(Administrator firstValue, Administrator secondValue) {
        return null;
    }
}
