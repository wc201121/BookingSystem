//to do list; rooms, time slots, resources, staff, login emails,  
package bookingsystem;

import java.util.*;

public class BookingSystem {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("BOOKING Manager");
        System.out.println("-----------------------");
        System.out.println("Please select and option:");
        System.out.println("1 - Book a Room");
        System.out.println("2 - User Login");
        System.out.println("3 - Staff Login");
        System.out.println("4 - Create an account");
        System.out.println("0 - Exit");
        System.out.println(" ");

        int userChoice = input.nextInt();

        switch (userChoice) {

            case 1:
                bookRoom();
                break;

            case 2:
                userLogin();
                break;

            case 3:
                staffLogin();
                break;

            case 4:
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

    }

    public static void staffLogin() {

    }
    
    public static void createAccount(){
        
    }
}
