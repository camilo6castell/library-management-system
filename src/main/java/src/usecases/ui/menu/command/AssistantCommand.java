package src.usecases.ui.menu.command;

import src.models.users.Assistant;
import src.usecases.ui.menu.ShowAssistantMenuUseCase;

import static src.data.DataBase.assistantSession;
import static src.usecases.ui.menu.ShowCountDown.countDown;

public class AssistantCommand implements Command<Assistant> {

    // COMMAND PATTER IMPLEMENTED
    @Override
    public void execute(Assistant assistant) {
        assistantSession = assistant;
        System.out.println("Iniciando sesión para " + assistant.getName() + " en: ");
        countDown(3);
        new ShowAssistantMenuUseCase().execute();
    }
}
