package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.assistant.ShowAllAssistantsUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class ShowAllAssistantsMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                    Lista de asistentes registrados en la biblioteca:
                    
                """);
        new ShowAllAssistantsUseCase().execute();
        new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        System.out.println();
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}

