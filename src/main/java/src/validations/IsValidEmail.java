package src.validations;

import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsValidEmail {
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static boolean execute(String email, Scanner scanner) {
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        } else {
            new PromptForStringInputUseCase().execute("El mail ingresado no es un válido. Ingrese cualquier valor para continuar: ", scanner);
        }
        return false;
    }
}
