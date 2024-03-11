package usecases.ui;

import data.DataBase;
import models.users.Reader;
import usecases.interfaces.IUseCase;

public class LoginReaderUseCase implements IUseCase<String, Boolean> {
    @Override
    public String execute(String value) {
        return null;
    }

    @Override
    public void execute() {}

    @Override
    public Boolean execute(String email, String password) {
        for (Reader reader : DataBase.libraryReaders) {
            if (reader.getEmail().equals(email) && reader.getPassword().equals(password)) {
                //ReaderSession.ReaderMenu();
                return true;
            }
        }
        return false;
    }

}