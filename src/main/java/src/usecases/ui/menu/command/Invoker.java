package src.usecases.ui.menu.command;

import src.models.users.User;

import java.util.HashMap;
import java.util.ArrayList;

import static src.data.DataBase.*;

public class Invoker {


    // COMMAND PATTER IMPLEMENTED

    private HashMap<String, Command> commands;

    public Invoker() {
        commands = new HashMap<>();
        commands.put("Administrator", new AdministratorCommand());
        commands.put("Assistant", new AssistantCommand());
        commands.put("Reader", new ReaderCommand());
    }

    public void execute(String email, String password){
        searchUser(libraryAdministrators, email, password);
        searchUser(libraryAssistants, email, password);
        searchUser(libraryReaders, email, password);
    }

    public <U extends User> void searchUser(ArrayList<U> UserList, String email, String password) {
        for (U user : UserList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
               commands.get(user.getClass().getSimpleName()).execute(user);
            }
        }

    }
}
