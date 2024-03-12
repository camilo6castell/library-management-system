package src.usecases.assistant;

import src.models.users.Assistant;
import src.usecases.interfaces.IUseCase;

import java.util.Scanner;

import static src.data.DataBase.libraryAssistants;

public class AddAssistantUseCase implements IUseCase<Object, Object> {

    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Creando asistente >>");
        System.out.println();
        System.out.print("Nombre del nuevo asistente: ");
        String name = scanner.next();
        System.out.print("Email del nuevo asistente: ");
        String email = scanner.next();
        System.out.print("Password del nuevo asistente: ");
        String password = scanner.next();
        libraryAssistants.add(new Assistant(name, email, password));
        System.out.println("El asistente " + name + " se ha agregado correctamente.");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
