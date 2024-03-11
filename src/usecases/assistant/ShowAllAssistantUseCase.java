package usecases.assistant;

import models.users.Assistant;
import models.users.Reader;
import usecases.interfaces.IUseCase;

import static data.DataBase.libraryAssistants;

public class ShowAllAssistantUseCase implements IUseCase<Object, Object> {

    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        for (int i = 0; i < libraryAssistants.size(); i++) {
            Assistant assistant = libraryAssistants.get(i);
            System.out.format("%d Nombre: %s - Email: %s\n", i + 1, assistant.getName(), assistant.getEmail());
        }
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
