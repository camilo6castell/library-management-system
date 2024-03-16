package src.usecases.ui.menu.command;

import src.models.users.Administrator;
import src.usecases.ui.menu.ShowAdministratorMenuUseCase;

import static src.data.DataBase.administratorSession;
import static src.usecases.ui.menu.ShowCountDown.countDown;

public class AdministratorCommand implements Command<Administrator> {

    // COMMAND PATTER IMPLEMENTED
    @Override
    public void execute(Administrator administrator) {
        administratorSession = administrator;
        System.out.println("Iniciando sesión para " + administrator.getName() + " en: ");
        countDown(3);
        new ShowAdministratorMenuUseCase().execute();
    }


}
