package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.reader.AddReaderUseCase;
import src.usecases.ui.ExitProgramUseCase;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsValidMenuOption;

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
            Integer chosenOption = new PromptForIntegerInputUseCase().execute("""
                _______________________________________________________________

                Biblioteca La Pingüinera
                
                Bienvenid@s!
                
                Escoje una opción:
                
                1 Iniciar sesión
                2 Registrarse
                
                0 Terminar programa
                
                Digite el número de la opción deseada:\s""", scanner);
            if (IsValidMenuOption.execute(chosenOption, 2)){
                mainMenuCases.get(chosenOption).execute();
            } else{
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