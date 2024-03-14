package src.usecases.ui.menu.command;

import src.models.users.Reader;
import src.usecases.ui.menu.ShowReaderMenuUseCase;

import static src.data.DataBase.readerSession;
import static src.usecases.ui.menu.ShowCountDown.countDown;

public class ReaderCommand implements Command<Reader> {

    // COMMAND PATTER IMPLEMENTED
    @Override
    public void execute(Reader reader) {
        readerSession = reader;
        System.out.println("Iniciando sesión para " + reader.getName() + " en: ");
        countDown(3);
        new ShowReaderMenuUseCase().execute();
    }
}
