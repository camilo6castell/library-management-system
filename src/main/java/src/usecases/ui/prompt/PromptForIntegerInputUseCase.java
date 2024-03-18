package src.usecases.ui.prompt;

import java.util.Scanner;

public class PromptForIntegerInputUseCase  {
    public Integer execute(String message, Scanner scanner) {
        System.out.print(message);
        try {
            return Integer.parseInt(scanner.next());
        } catch (NumberFormatException e){
            System.out.println("El valor ingresado no es un número.");
        }
        return null;
    }
}
