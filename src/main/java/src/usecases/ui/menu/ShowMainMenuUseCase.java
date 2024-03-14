package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.reader.AddReaderUseCase;
import src.usecases.ui.prompt.AskForOptionMenuUseCase;
import src.usecases.ui.ExitProgramUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.Option;

import java.util.HashMap;
import java.util.Scanner;

public class ShowMainMenuUseCase implements IUseCase<Object, Object> {

    @Override
    public Object execute(Object value) {
        return null;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, IUseCase<Object, Object>> mainMenuCases = new HashMap<>();
        mainMenuCases.put(1, new ShowLogInMenuUseCase());
        mainMenuCases.put(2, new AddReaderUseCase());
        mainMenuCases.put(0, new ExitProgramUseCase());
        do {
            String option = new AskForOptionMenuUseCase().execute("""
                _______________________________________________________________

                Biblioteca La Pingüinera
                
                Bienvenid@s!
                
                Escoja una opción:
                
                1 Iniciar sesión
                2 Registrarse
                
                0 Terminar programa
                
                """);
            if (Option.isValid(option, 2)){
                int validatedOption = Integer.parseInt(option);
                mainMenuCases.get(validatedOption).execute();
            } else{
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