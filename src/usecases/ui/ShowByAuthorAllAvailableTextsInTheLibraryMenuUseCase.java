package usecases.ui;

import usecases.interfaces.IUseCase;

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
        new ShowAlertMessageUseCase().execute("\n");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
