package model.users;

public class Administrator extends User {

    public Administrator(String name, String email, String password) {
        super(name, email, password, "administrator");
    }

    public void addResource() {
        // Implementar la lógica para agregar un recurso
    }

    public void updateResource() {
        // Implementar la lógica para actualizar un recurso
    }

    public void deleteResource() {
        // Implementar la lógica para eliminar un recurso
    }

    public void getResource() {
        // Implementar la lógica para obtener un recurso
    }

    public void addAssistant() {
        // Implementar la lógica para agregar un asistente
    }
}
