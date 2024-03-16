package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.ui.*;
import src.usecases.ui.prompt.AskForOptionMenuUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.Option;

import java.util.HashMap;
import java.util.Scanner;

public class ShowAddBookOrNovelMenuUseCase implements IUseCase<Object, Object> {

    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, IUseCase<Object, Object>> addBookOrNovelUseCases = new HashMap<>();
        addBookOrNovelUseCases.put(1, new ShowAddBookMenuUseCase());
        addBookOrNovelUseCases.put(2, new ShowAddNovelMenuUseCase());
        addBookOrNovelUseCases.put(3, new ShowAdministratorMenuUseCase());
        addBookOrNovelUseCases.put(0, new ExitProgramUseCase());
        do {
            String option = new AskForOptionMenuUseCase().execute("""
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
                addBookOrNovelUseCases.get(validatedOption).execute();
            } else {
                new PromptForStringInputUseCase().execute("""
                        _______________________________________________________________


                        Ha ingreso un valor incorrecto. El valor debe estar entre las
                        opciones mostradas.
                                       
                        """, scanner);
            }
        } while (true);
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }

}
