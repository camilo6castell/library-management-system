package usecases.reader;

import static data.DataBase.libraryReaders;

import models.users.Reader;
import usecases.interfaces.IUseCase;
import usecases.ui.ShowAlertMessageUseCase;

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
        new ShowAlertMessageUseCase().execute("\n");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
