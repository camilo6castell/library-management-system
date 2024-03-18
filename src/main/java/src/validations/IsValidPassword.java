package src.validations;

import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class IsValidPassword {
    public static boolean isValidPassword(String password, Scanner scanner) {
        if (password.length() >= 8) {
            return true;
        } else {
            new PromptForStringInputUseCase().execute("Recuerda que el password debe tener mínimo 8 caracteres. Ingrese cualquier valor para continuar: ", scanner);
        }
        return false;
    }
}
