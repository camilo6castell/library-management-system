package usecases.ui;

import usecases.interfaces.IUseCase;
import validations.Option;

import java.util.HashMap;

public class ShowAddBookOrNovelMenuUseCase implements IUseCase<Class<?>, Object> {

    @Override
    public Class<?> execute(Class<?> classInstance) {
        HashMap<Integer, IUseCase> addBookOrNovelUseCases = new HashMap<>();
        addBookOrNovelUseCases.put(1, new ShowAddBookMenuUseCase());
        addBookOrNovelUseCases.put(2, new ShowAddNovelMenuUseCase());
        addBookOrNovelUseCases.put(3, new ShowAdministratorMenuUseCase());
        addBookOrNovelUseCases.put(0, new ExitProgramUseCase());
        do {
            String option = new AskOptionMenuUseCase().execute("""
                     _______________________________________________________________

                     Agregar libro o novela
                                     
                    ¿Qué deseas agregar?
                                     
                    1 Agregar libro
                    2 Agregar novela
                                   
                    3 Ir al menú de atrás
                    0 Terminar programa
                     
                     """);
            if (Option.isValid(option, 3)) {
                int validatedOption = Integer.parseInt(option);
                addBookOrNovelUseCases.get(validatedOption).execute(classInstance);
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
    public Class<?> execute() {
        return null;
    }

    @Override
    public Object execute(Class<?> firstValue, Class<?> secondValue) {
        return null;
    }
}
