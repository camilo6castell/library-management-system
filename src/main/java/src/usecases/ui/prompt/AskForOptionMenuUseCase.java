package src.usecases.ui.prompt;

import src.usecases.interfaces.IUseCase;

import java.util.Scanner;

public class AskForOptionMenuUseCase implements IUseCase<String, Object> {

    @Override
    public String execute(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        System.out.print("Digite el número de la opción deseada: ");
        return scanner.next();
    }

    @Override
    public void execute() {}

    @Override
    public String execute(String message, String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.format(message, name);
        System.out.print("Digite el número de la opción deseada: ");
        return scanner.next();
    }
}
