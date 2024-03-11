package usecases.reader;

import static data.DataBase.libraryReaders;
import models.users.Reader;
import usecases.interfaces.IUseCase;

public class ShowAllReadersUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute() {
        for (int i = 0; i < libraryReaders.size(); i++) {
            Reader reader = libraryReaders.get(i);
            System.out.format("%d Nombre: %s - Email: %s\n", i + 1, reader.getName(), reader.getEmail());
        }
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
