package src.usecases.assistant;

import static src.data.DataBase.libraryAssistants;
import static src.data.DataBase.assistantSession;
import src.models.users.Assistant;

import src.usecases.ui.menu.ShowAssistantMenuUseCase;

public class LoginAssistantUseCase {
    public Boolean execute(String email, String password) {
        for (Assistant assistant : libraryAssistants) {
            if (assistant.getEmail().equals(email) && assistant.getPassword().equals(password)) {
                assistantSession = assistant;
                new ShowAssistantMenuUseCase().execute();
            }
        }
        return false;
    }

}
