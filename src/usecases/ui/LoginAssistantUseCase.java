package usecases.ui;

import data.DataBase;
import models.users.Assistant;
import usecases.interfaces.IUseCase;

public class LoginAssistantUseCase implements IUseCase<String, Boolean> {
    @Override
    public String execute(String value) {
        return null;
    }

    @Override
    public String execute() {
        return null;
    }

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
