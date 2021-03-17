
package bookingsystem;

public class Staff {
    
    private String staffUsername;
    private String staffPassword;
    private int staffID;

    public Staff(String staffUsername, String staffPassword, int staffID) {
        this.staffUsername = staffUsername;
        this.staffPassword = staffPassword;
        this.staffID = staffID;
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }
    
    
    
}
