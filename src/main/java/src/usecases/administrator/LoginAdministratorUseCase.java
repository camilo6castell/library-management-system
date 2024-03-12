package src.usecases.administrator;

import static src.data.DataBase.libraryAdministrators;
import static src.data.DataBase.administratorSession;

import src.models.users.Administrator;

import src.usecases.ui.menu.ShowAdministratorMenuUseCase;

public class LoginAdministratorUseCase {

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
