package usecases.ui;

import static data.DataBase.libraryAssistants;
import static data.DataBase.assistantSession;
import models.users.Assistant;
import usecases.interfaces.IUseCase;

public class LoginAssistantUseCase implements IUseCase<String, Boolean> {
    @Override
    public String execute(String value) {
        return null;
    }

    @Override
    public void execute() {}

    @Override
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
