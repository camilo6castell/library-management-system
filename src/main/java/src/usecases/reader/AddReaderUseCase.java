package src.usecases.reader;

import static src.data.DataBase.libraryReaders;
import static src.validations.IsValidName.isValidName;
import static src.validations.IsValidPassword.isValidPassword;

import src.models.users.Reader;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.menu.ShowMainMenuUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsValidEmail;

import java.util.Scanner;

public class AddReaderUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                _______________________________________________________________

                Registro de nuevo usuario >>
                """);
        String name = new PromptForStringInputUseCase().execute("Nombre: ", scanner);
        if (isValidName(name, scanner)) {
            String email = new PromptForStringInputUseCase().execute("Email: ", scanner);
            if (IsValidEmail.execute(email, scanner)) {
                String password = new PromptForStringInputUseCase().execute("Password [Recuerda que debe tener mínimo 8 carácteres o más]: ", scanner);
                if (isValidPassword(password, scanner)) {
                    libraryReaders.add(new Reader(name, email, password));
                    System.out.println("El usuario" + name + " se ha registrado correctamente. Ahora puedes iniciar sesión.");
                    new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
                }
            }
        }
        new ShowMainMenuUseCase().execute();
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
