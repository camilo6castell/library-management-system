package usecases.ui;

import data.DataBase;
import models.users.Assistant;
import usecases.assistant.AddAssistantUseCase;
import usecases.interfaces.IUseCase;
import usecases.ui.ShowAlertMessageUseCase;

import java.util.ArrayList;
import java.util.Scanner;

public class AddAssistantMenuUseCase implements IUseCase<ArrayList<Assistant>, Object> {

    @Override
    public ArrayList<Assistant> execute(ArrayList<Assistant> value) {
        return null;
    }

    @Override
    public void execute() {
        new AddAssistantUseCase().execute();
        new ShowAlertMessageUseCase().execute("\n");
    }

    @Override
    public Object execute(ArrayList<Assistant> firstValue, ArrayList<Assistant> secondValue) {
        return null;
    }
}
