package usecases.ui;

import usecases.interfaces.IUseCase;

import java.util.Scanner;

public class AskOptionMenuUseCase implements IUseCase<String, Object> {

    @Override
    public String execute(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.format(message);
        System.out.print("Digite el número de la opción deseada: ");
        return scanner.next();
    }

    @Override
    public String execute() {
        return null;
    }

    @Override
    public String execute(String message, String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        System.out.print("Digite el número de la opción deseada: ");
        return scanner.next();
    }
}