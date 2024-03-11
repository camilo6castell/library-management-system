package usecases.ui;

import usecases.interfaces.IUseCase;
import usecases.novel.ShowAllNovelsUseCase;

public class ShowAllNovelsMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public void execute(){
        System.out.println("""
                Lista de Novelas:
                
                """);
        new ShowAllNovelsUseCase().execute();
        new ShowAlertMessageUseCase().execute("\n");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
