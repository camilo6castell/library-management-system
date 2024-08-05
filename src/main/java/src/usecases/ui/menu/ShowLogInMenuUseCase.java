package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;

import src.usecases.ui.menu.command.Invoker;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class ShowLogInMenuUseCase implements IUseCase<Object, Object> {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                _______________________________________________________________

                Iniciar sesión
                """);


        String email = new PromptForStringInputUseCase().execute("Digite su correo electrónico: ", scanner);
        String password = new PromptForStringInputUseCase().execute("Digite su contraseña: ", scanner);
        System.out.println();

        // COMMAND PATTER IMPLEMENTED

        new Invoker().execute(email, password);

        //

        new PromptForStringInputUseCase().execute("""
                _______________________________________________________________

                Credenciales incorrectas
                
                Ingrese cualquier valor para continua:\s""", scanner);
    }
    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }

    @Override
    public Object execute(Object value) {
        return null;
    }
}
