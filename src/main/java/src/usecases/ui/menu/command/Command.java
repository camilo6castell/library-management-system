package src.usecases.ui.menu.command;

public interface Command <T>{

    // COMMAND PATTER IMPLEMENTED

    void execute(T value);
}
