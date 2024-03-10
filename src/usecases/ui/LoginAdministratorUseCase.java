package usecases.ui;

import data.DataBase;
import models.users.Administrator;
import usecases.interfaces.IUseCaseObjectObject;

public class LoginAdministratorUseCase implements IUseCaseObjectObject<String, Boolean> {
    @Override
    public Boolean execute(String email, String password) {
        for (Administrator administrator : DataBase.libraryAdministrators) {
            if (administrator.getEmail().equals(email) && administrator.getPassword().equals(password)) {
                AdministratorSession.AdministratorMenu(administrator);
            }
        }
        return false;
    }

}
