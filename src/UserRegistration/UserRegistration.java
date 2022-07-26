package UserRegistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the User Registration Program");

        //creating method firstNameCheck to check firstName is valid or not

            UserRegistration user = new UserRegistration();

            System.out.println("Welcome to User Registration Program");

            user.firstNameCheck();

        }




        private void firstNameCheck() {
            System.out.print("Enter First Name of User: ");
            Scanner sc = new Scanner(System.in);
            String fName = sc.nextLine();
            /*
             * As a User need to enter a valid firstName -firstName starts with Cap and has
             * minimum 3 characters
             */

            boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
            if (check)
                System.out.println("Valid");
            else
                System.out.println("Please Enter a Valid firstName with Only \"One Starting Capital\" letter");
        }

    }






