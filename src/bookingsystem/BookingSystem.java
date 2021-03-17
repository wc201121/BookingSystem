//to do list; rooms, time slots, resources, staff, login emails,  
//can do (fix); userID generator, log in system, add user system
package bookingsystem;

import java.util.*;

public class BookingSystem {

    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();
    private static ArrayList<User> UserList = new ArrayList<>();

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
            System.out.println("Enter your username");
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

    public static int searchForUserName() {

        System.out.println("Please type in your Username");
        String userName = input.next();

        for (int i = 0; i < UserList.size(); i++) {
            if (userName.equals(UserList.get(i).getUsername())) {
                return i;
            }

        }
        return -1;

    }

    public static void staffLogin() {

    }

    public static void createAccount() {

        System.out.println("Please enter a username: ");
        String username = input.next();
        System.out.println("Please enter a password: ");
        String password = input.next();
        int userID = rand.nextInt(1000);

        User MyUser = new User(username, password, userID);

        System.out.println(" ");
        userLogin();
    }

    public static void staffMenu() {
        //options - condiments, cleaning times, booking slots, add new staff (maybe)
    }
}
