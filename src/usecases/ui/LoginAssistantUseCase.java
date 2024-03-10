package usecases.ui;

import data.DataBase;
import models.users.Assistant;
import usecases.interfaces.IUseCaseObjectObject;

public class LoginAssistantUseCase implements IUseCaseObjectObject<String, Boolean> {
    @Override
    public Boolean execute(String email, String password) {
        for (Assistant assistant : DataBase.libraryAssistants) {
            if (assistant.getEmail().equals(email) && assistant.getPassword().equals(password)) {
                AssistantSession.AdministratorMenu(assistant);
                return true;
            }
        }
        return false;
    }

}
