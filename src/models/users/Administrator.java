package models.users;

public class Administrator extends User {

    public Administrator(String name, String email, String password) {
        super(name, email, password,
                "administrator");
    }
}