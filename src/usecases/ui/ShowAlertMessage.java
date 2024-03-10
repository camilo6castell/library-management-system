package usecases.ui;

import usecases.interfaces.IUseCaseObject;

import java.util.Scanner;

public class ShowAlertMessage implements IUseCaseObject<String> {

    @Override
    public String execute(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        System.out.print("Ingrese cualquier valor para continuar: ");
        return scanner.next();
    }
}
