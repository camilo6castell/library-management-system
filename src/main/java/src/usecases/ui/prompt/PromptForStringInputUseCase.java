package src.usecases.ui.prompt;

import java.util.Scanner;

public class PromptForStringInputUseCase {
    public String execute(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
