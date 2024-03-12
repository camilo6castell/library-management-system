package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.administrator.LoginAdministratorUseCase;
import src.usecases.assistant.LoginAssistantUseCase;
import src.usecases.reader.LoginReaderUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class ShowLogInMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                _______________________________________________________________

                ** Iniciar sesión **
                                
                """);

        System.out.print("Digite su correo electrónico: ");
        String email = scanner.nextLine();

        System.out.print("Digite su contraseña: ");
        String password = scanner.nextLine();

        new LoginAdministratorUseCase().execute(email, password);
        new LoginAssistantUseCase().execute(email, password);
        new LoginReaderUseCase().execute(email, password);
        new PromptForStringInputUseCase().execute("""
                _______________________________________________________________

                Credenciales incorrectas
                
                """, scanner);
    }
    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
