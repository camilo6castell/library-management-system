package usecases.ui;

import data.DataBase;
import models.users.Administrator;
import usecases.interfaces.IUseCase;

public class LoginAdministratorUseCase implements IUseCase<String, Boolean> {
    @Override
    public String execute(String value) {
        return null;
    }

    @Override
    public void execute() {}

    @Override
    public Boolean execute(String email, String password) {
        for (Administrator administrator : DataBase.libraryAdministrators) {
            if (administrator.getEmail().equals(email) && administrator.getPassword().equals(password)) {
                new ShowAdministratorMenuUseCase().execute();
            }
        }
        return false;
    }

}
