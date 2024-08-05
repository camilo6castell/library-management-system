package src.usecases.assistant;

import src.models.users.Assistant;

import src.usecases.interfaces.IUseCase;

import static src.data.DataBase.libraryAssistants;

public class ShowAllAssistantsUseCase {
    public void execute() {
        for (int i = 0; i < libraryAssistants.size(); i++) {
            Assistant assistant = libraryAssistants.get(i);
            System.out.format("%d Nombre: %s - Email: %s\n", i + 1, assistant.getName(), assistant.getEmail());
        }
    }
}
