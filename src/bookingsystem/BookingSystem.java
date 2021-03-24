//to do list; rooms, time slots, resources, staff
//can do (fix);log in system, add user system, check email
package bookingsystem;

import java.util.*;

public class BookingSystem {

    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();
    private static ArrayList<User> UserList = new ArrayList<>();
    private static ArrayList<Staff> StaffList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("BOOKING Manager");
        System.out.println("-----------------------");
        System.out.println("Please select and option:");
        System.out.println("1 - User Login");
        System.out.println("2 - Staff Login");
        System.out.println("3 - Create an account");
        System.out.println("0 - Exit");
        System.out.println(" ");

        int userChoice = input.nextInt();

        switch (userChoice) {

            case 1:
                userLogin();
                break;

            case 2:
                staffLogin();
                break;

            case 3:
                createAccount();
                break;

            case 0:
                System.exit(0);
                break;

        }

    }

    public static void bookRoom() {

    }

    public static void userLogin() {

        System.out.println(" ");
        System.out.println("Log In");
        System.out.println("----------------");

        int attempts = 0;

        int index = searchForUserName();

        while (attempts <= 4) {
            System.out.println("Enter your Username");
            String logInUsername = input.next();
            System.out.println("Enter your password");
            String logInPassword = input.next();
            if (logInUsername == UserList.get(index).getUsername() && logInPassword == UserList.get(index).getPassword()) {
                attempts = 5;
                bookRoom();

            } else {
                attempts++;
                int remainingAttempts = 4 - attempts;
                System.out.println("Try again, you have " + remainingAttempts + " more tries");

            }
        }

        System.exit(0);

    }

    public static void staffLogin() {

        System.out.println(" ");
        System.out.println("Log In");
        System.out.println("----------------");

        int attempts = 0;

        int index = searchForStaffUserName();

        while (attempts <= 4) {
            System.out.println("Enter your Username");
            String logInUsername = input.next();
            System.out.println("Enter your password");
            String logInPassword = input.next();
            if (logInUsername == StaffList.get(index).getStaffUsername() && logInPassword == StaffList.get(index).getStaffPassword()) {
                attempts = 5;
                bookRoom();

            } else {
                attempts++;
                int remainingAttempts = 4 - attempts;
                System.out.println("Try again, you have " + remainingAttempts + " more tries");

            }
        }

        System.exit(0);

    }

    public static void createAccount() {

        System.out.println("Please enter a username: ");
        String username = input.next().toString();
        System.out.println("Please enter a password: ");
        String password = input.next().toString();
        System.out.println("Please enter your email");
        String UserEmail = input.next().toString();
        String UserID = IDGenerator();
        System.out.println("Your UserID is: (please save for later use)");
        System.out.println(UserID);

        User MyUser = new User(username, password, UserEmail, UserID);

        System.out.println(" ");
        userLogin();
    }

    public static void staffMenu() {
        //options - condiments, cleaning times, booking slots, add new staff

        System.out.println("Staff Menu");
        System.out.println("------------------");
        System.out.println(" ");
        System.out.println("Please select and option: ");
        System.out.println("1 - Timetable");
        System.out.println("2 - Add new staff");
        System.out.println("0 - Exit");

        int staffInput = input.nextInt();

        switch (staffInput) {

            case 1:

            case 2:
                AddStaff();

            case 0:
                System.exit(0);

        }

    }

    public static void AddStaff() {
        System.out.println("Please enter your username");
        String StaffUsername = input.next().toString();
        System.out.println("Please enter a password");
        String StaffPassword = input.next().toString();
        String StaffID = IDGenerator();
        System.out.println("Your StaffID is: (Please save for later use)");
        System.out.println(StaffID);

        Staff MyStaff = new Staff(StaffUsername, StaffPassword, StaffID);

        System.out.println(" ");
        staffLogin();
    }

    public static String IDGenerator() {

        String UserID = UUID.randomUUID().toString();

        return UserID;
    }

    public static int searchForUserName() {

        System.out.println("Please type in your ID");
        String userID = input.next();

        for (int i = 0; i < UserList.size(); i++) {
            if (userID.equals(UserList.get(i).getUserID())) {
                return i;
            }

        }
        return -1;

    }
    
        public static int searchForStaffUserName() {

        System.out.println("Please type in your ID");
        String StaffID = input.next();

        for (int i = 0; i < StaffList.size(); i++) {
            if (StaffID.equals(StaffList.get(i).getStaffID())) {
                return i;
            }

        }
        return -1;

    }

}
