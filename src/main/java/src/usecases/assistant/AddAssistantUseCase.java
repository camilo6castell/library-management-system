package src.usecases.assistant;

import src.models.users.Assistant;

import src.usecases.ui.menu.ShowAdministratorMenuUseCase;
import src.usecases.ui.prompt.PromptForStringInputUseCase;
import src.validations.IsValidEmail;

import java.util.Scanner;

import static src.data.DataBase.libraryAssistants;
import static src.validations.IsValidName.isValidName;
import static src.validations.IsValidPassword.isValidPassword;

public class AddAssistantUseCase {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                        _______________________________________________________________


                        Creando asistente >>
                                       
                        """);
        String name =  new PromptForStringInputUseCase().execute("Nombre del nuevo asistente: ", scanner);
        if (isValidName(name, scanner)){
            String email = new PromptForStringInputUseCase().execute("Email del nuevo asistente: ", scanner);
            if (IsValidEmail.execute(email, scanner)){
                String password = new PromptForStringInputUseCase().execute("Password del nuevo asistente [Recuerda que debe tener mínimo 8 carácteres o más]: ", scanner);
                if (isValidPassword(password, scanner)){
                    libraryAssistants.add(new Assistant(name, email, password));
                    System.out.println("El asistente " + name + " se ha agregado correctamente.");
                    new PromptForStringInputUseCase().execute("Ingrese cualquier valor para continuar: ", scanner);
                }
            }
        }
        new ShowAdministratorMenuUseCase().execute();
    }
}
