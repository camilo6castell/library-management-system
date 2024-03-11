package models.users;

public class Assistant extends User {
    public Assistant(String name, String email, String password) {
        super(name, email, password, "assistant");
    }
}
