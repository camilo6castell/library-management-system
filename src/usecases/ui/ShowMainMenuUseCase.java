package usecases.ui;

import usecases.interfaces.IUseCase;
import validations.Option;

import java.util.HashMap;

public class ShowMainMenuUseCase implements IUseCase {

    public void execute() {
        HashMap<Integer, IUseCase> mainMenuCases = new HashMap<>();
        mainMenuCases.put(1, new ShowLogInMenuUseCase());
        mainMenuCases.put(2, new ShowLogInMenuUseCase());
        mainMenuCases.put(0, new ExitProgram());
        do {
            String option = new AskOptionMenuUseCase().execute("""
                _______________________________________________________________

                ** Biblioteca La Pingüinera **
                
                Bienvenido!
                
                1 Iniciar sesión
                2 Registrarse
                
                0 Terminar programa
                
                """);
            if (Option.isValid(option, 2)){
                int validatedOption = Integer.parseInt(option);
                mainMenuCases.get(validatedOption).execute();
            } else{
                new ShowAlertMessage().execute("""
                _______________________________________________________________


                Ha ingreso un valor incorrecto. El valor debe estar entre las
                opciones mostradas.                
                               
                """);
            }
        } while (true);
    }
}