package Kiemtracuoikijava;

public class User {
    long id;
     String username;
     String email;
     String password;
public User(){}
    public User(long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
       setEmail(email);
       setPassword(password);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Validate.validateEmail(email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Validate.validatePassword(password);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " - " + username + " - "  + email + " - " + password;
    }

}
