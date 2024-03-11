package usecases.ui;

import usecases.interfaces.IUseCase;
import validations.Option;

import java.util.HashMap;

public class ShowReaderMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        HashMap<Integer, IUseCase> assistantMenuUseCases = new HashMap<>();
        assistantMenuUseCases.put(1, new ShowBooksOrNovelsAvailableToBorrowMenuUseCase());
        assistantMenuUseCases.put(2, new ShowByAuthorAllAvailableTextsInTheLibraryMenuUseCase());
        assistantMenuUseCases.put(3, new ShowTextLoanHistoryMenuUseCase());
        assistantMenuUseCases.put(4, new ShowMainMenuUseCase());
        assistantMenuUseCases.put(0, new ExitProgramUseCase());
        do {
            String option = new AskOptionMenuUseCase().execute("""
                    _______________________________________________________________

                    Bienvenido lector
                                                        
                    ¿Qué deseas hacer?
                                                        
                    1 Listar libros o novelas disponibles para prestar
                    2 Listar por autor todos los textos en la biblioteca
                    
                    3 Ver historial de peticiones de textos
                                                     
                    4 Cerrar sesión
                    0 Terminar programa
                                                        
                    """);
            if (Option.isValid(option, 5)) {
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
