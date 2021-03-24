
package bookingsystem;

public class User {
    
    private String username;
    private String password;
    private String UserID;
    private String UserEmail;

    public User(String username, String password, String UserEmail, String UserID) {
        this.username = username;
        this.password = password;
        this.UserID = UserID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }
    
        public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }   
    
}
