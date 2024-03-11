package usecases.ui;

import usecases.interfaces.IUseCase;
import validations.Option;

import java.util.HashMap;

public class ShowUpdateBookOrNovelMenuUseCase implements IUseCase<Class<?>, Object> {
    @Override
    public Class<?> execute(Class<?> classInstance) {
        HashMap<Integer, IUseCase> updateBookOrNovelUseCases = new HashMap<>();
        updateBookOrNovelUseCases.put(1, new ShowUpdateBookMenuUseCase());
        updateBookOrNovelUseCases.put(2, new ShowUpdateNovelMenuUseCase());
        updateBookOrNovelUseCases.put(3, new ShowAdministratorMenuUseCase());
        updateBookOrNovelUseCases.put(0, new ExitProgramUseCase());
        do {
            String option = new AskOptionMenuUseCase().execute("""
                     _______________________________________________________________

                    Actualizar libro o novela
                                
                    ¿Qué deseas actualizar?
                                
                    1 Actualizar libro
                    2 Actualizar novela
                                
                    3 Ir al menú de atrás
                    0 Terminar programa
                     
                     """);
            if (Option.isValid(option, 3)) {
                int validatedOption = Integer.parseInt(option);
                updateBookOrNovelUseCases.get(validatedOption).execute(classInstance);
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
    public void execute() {}

    @Override
    public Object execute(Class<?> firstValue, Class<?> secondValue) {
        return null;
    }
}
