package usecases.ui;

import usecases.interfaces.IUseCase;

import java.util.Scanner;

public class ShowLogInMenuUseCase implements IUseCase {
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
        new ShowAlertMessage().execute("""
                _______________________________________________________________

                Credenciales incorrectas
                
                """);
    }
}
