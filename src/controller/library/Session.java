package controller.library;

import data.DataBase;
import model.users.Administrator;
import model.users.Assistant;
import model.users.Reader;

import java.util.Scanner;

import static controller.library.AdministratorSession.AdministratorMenu;
import static controller.library.AssistantSession.AssistantMenu;
import static controller.library.ReaderSession.ReaderMenu;

public class Session {
    public static void logIn() {
        Scanner scanner = new Scanner(System.in);
        boolean isUser = false;

        System.out.println("""
                _______________________________________________________________

                ** Iniciar sesión **
                """);

        System.out.print("Digite su correo electrónico: ");
        String email = scanner.nextLine();

        System.out.print("Digite su contraseña: ");
        String password = scanner.nextLine();

        isUser = isAdministrator(email, password, isUser);
        isUser = isAssistant(email, password, isUser);
        isUser = isReader(email, password, isUser);

        if (!isUser) {
            System.out.println("Credenciales incorrectas");
        }
    }

    public static boolean isAdministrator(String email, String password, boolean isUser){
        for (Administrator administrator : DataBase.libraryAdministrators) {
            if (administrator.getEmail().equals(email) && administrator.getPassword().equals(password)) {
                isUser = true;
                AdministratorMenu(administrator);
            }
        }
        return isUser;
    }

    public static boolean isAssistant(String email, String password, boolean isUser){
        for (Assistant assistant : DataBase.libraryAssistants) {
            if (assistant.getEmail().equals(email) && assistant.getPassword().equals(password)) {
                isUser = true;
                AssistantMenu(assistant);
            }
        }
        return isUser;
    }

    public static boolean isReader(String email, String password, boolean isUser){
        for (Reader reader : DataBase.libraryReaders) {
            if (reader.getEmail().equals(email) && reader.getPassword().equals(password)) {
                isUser = true;
                ReaderMenu(reader);
            }
        }
        return isUser;
    }
}
