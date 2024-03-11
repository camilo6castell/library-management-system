package usecases.ui;

import usecases.interfaces.IUseCase;
import validations.Option;

import java.util.HashMap;

public class ShowAllBooksOrNovelsUseCase implements IUseCase<Class<?>, Object> {
    @Override
    public Class<?> execute(Class<?> value) {
        return null;
    }

    @Override
    public void execute() {
        HashMap<Integer, IUseCase> showAllBooksOrNovelsUseCases = new HashMap<>();
        showAllBooksOrNovelsUseCases.put(1, new ShowAllBooksMenuUseCase());
        showAllBooksOrNovelsUseCases.put(2, new ShowAllNovelsMenuUseCase());
        showAllBooksOrNovelsUseCases.put(3, new ShowAdministratorMenuUseCase());
        showAllBooksOrNovelsUseCases.put(0, new ExitProgramUseCase());
        do {
            String option = new AskOptionMenuUseCase().execute("""
                     _______________________________________________________________

                    Mostrar libros o novelas
                                
                    ¿Qué deseas ver?
                                
                    1 Ver libros
                    2 Ver novelas
                                
                    3 Ir al menú de atrás
                    0 Terminar programa
                     
                     """);
            if (Option.isValid(option, 3)) {
                int validatedOption = Integer.parseInt(option);
                showAllBooksOrNovelsUseCases.get(validatedOption).execute();
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
    public Object execute(Class<?> firstValue, Class<?> secondValue) {
        return null;
    }
}