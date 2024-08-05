package src.validations;

import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class IsValidName {
    public static boolean isValidName(String name, Scanner scanner) {
        if (isValidLength(name)) {
            return isValidFormat(name, scanner);
        } else {
            new PromptForStringInputUseCase().execute("El nombre no puede tener menos de 3 carácteres. Ingrese cualquier valor para continuar: ", scanner);
        }
        return false;
    }

    private static boolean isValidLength(String name) {
        return name.length() >= 3;
    }

    private static boolean isValidFormat(String name, Scanner scanner) {
        if (!name.matches(".*\\d.*")) {
            return true;
        } else {
            new PromptForStringInputUseCase().execute("El nombre no puede tener números. Ingrese cualquier valor para continuar: ", scanner);
        }
        return false;
    }
}
