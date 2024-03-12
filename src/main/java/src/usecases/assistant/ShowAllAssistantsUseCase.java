package src.usecases.assistant;

import src.models.users.Assistant;

import src.usecases.interfaces.IUseCase;

import static src.data.DataBase.libraryAssistants;

public class ShowAllAssistantsUseCase implements IUseCase<Object, Object> {

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
