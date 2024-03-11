package usecases.ui;

import usecases.interfaces.IUseCase;

import java.util.Scanner;

public class ShowAlertMessageUseCase implements IUseCase<String, Object> {

    @Override
    public String execute(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        System.out.print("Ingrese cualquier valor para continuar: ");
        return scanner.next();
    }

    @Override
    public void execute() {}

    @Override
    public Object execute(String firstValue, String secondValue) {
        return null;
    }
}
