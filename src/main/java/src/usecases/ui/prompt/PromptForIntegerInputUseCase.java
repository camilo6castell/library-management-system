package src.usecases.ui.prompt;

import java.util.Scanner;

public class PromptForIntegerInputUseCase  {
    public Integer execute(String message, Scanner scanner) {
        System.out.print(message);
        return Integer.parseInt(scanner.nextLine());
    }
}
