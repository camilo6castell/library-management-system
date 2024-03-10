package usecases.ui;

import usecases.interfaces.IUseCaseObject;

import java.util.Scanner;

public class AskOptionMenuUseCase implements IUseCaseObject<String> {

    @Override
    public String execute(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        System.out.print("Digite el número de la opción deseada: ");
        return scanner.next();
    }
}
