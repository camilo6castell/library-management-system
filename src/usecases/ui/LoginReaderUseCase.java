package usecases.ui;

import data.DataBase;
import models.users.Reader;
import usecases.interfaces.IUseCaseObjectObject;

public class LoginReaderUseCase implements IUseCaseObjectObject<String, Boolean> {
    @Override
    public Boolean execute(String email, String password) {
        for (Reader reader : DataBase.libraryReaders) {
            if (reader.getEmail().equals(email) && reader.getPassword().equals(password)) {
                ReaderSession.ReaderMenu(reader);
                return true;
            }
        }
        return false;
    }

}