package src.usecases.reader;

import static src.data.DataBase.libraryReaders;

import src.models.users.Reader;
import src.usecases.interfaces.IUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class AddReaderUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String name, email, password;
        System.out.println();
        System.out.println("Registro de nuevo usuario >>");
        System.out.println();
        System.out.print("Nombre: ");
        name = scanner.nextLine();
        System.out.println();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.println();
        System.out.print("Password: ");
        password = scanner.nextLine();
        libraryReaders.add(new Reader(name, email, password));
        System.out.println();
        System.out.println("Usuario Creado con éxito. Ahora puedes iniciar sesión. ");
        new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
