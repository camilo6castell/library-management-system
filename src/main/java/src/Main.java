package src;

import src.usecases.ui.menu.ShowMainMenuUseCase;

public class Main {
    public static void main(String[] args) {
        new ShowMainMenuUseCase().execute();
    }
}