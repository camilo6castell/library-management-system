package src.usecases.reader;

import static src.data.DataBase.libraryReaders;
import static src.data.DataBase.readerSession;

import src.models.users.Reader;
import src.usecases.ui.menu.ShowReaderMenuUseCase;

public class LoginReaderUseCase {

    public Boolean execute(String email, String password) {
        for (Reader reader : libraryReaders) {
            if (reader.getEmail().equals(email) && reader.getPassword().equals(password)) {
                readerSession = reader;
                new ShowReaderMenuUseCase().execute();
            }
        }
        return false;
    }
}