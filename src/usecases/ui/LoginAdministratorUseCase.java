package usecases.ui;

import static data.DataBase.libraryAdministrators;
import static data.DataBase.administratorSession;

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
        for (Administrator administrator : libraryAdministrators) {
            if (administrator.getEmail().equals(email) && administrator.getPassword().equals(password)) {
                administratorSession = administrator;
                new ShowAdministratorMenuUseCase().execute();
            }
        }
        return false;
    }

}
