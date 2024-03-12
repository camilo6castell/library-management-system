package src.usecases.ui.menu;

import src.usecases.interfaces.IUseCase;
import src.usecases.text.ShowAllTextsByAuthorUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.util.Scanner;

public class ShowByAuthorAllAvailableTextsInTheLibraryMenuUseCase  implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Lista por autor de todos los textos en la biblioteca");
        System.out.println();
        new ShowAllTextsByAuthorUseCase().execute();
        new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
        System.out.println();
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
