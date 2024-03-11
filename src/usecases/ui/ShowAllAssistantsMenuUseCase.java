package usecases.ui;

import usecases.interfaces.IUseCase;
import usecases.reader.ShowAllReadersUseCase;

public class ShowAllAssistantsMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        System.out.println("""
                    Lista de asistentes registrados en la biblioteca:
                """);
        new ShowAllReadersUseCase().execute();
        new ShowAlertMessageUseCase().execute("\n");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}

