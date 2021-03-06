package UserRegistrationLambdaExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface ValidationUser {
    void validate();
}

public class UserRegistrationLambda {
    Scanner sc = new Scanner(System.in);

    public void userDetails() {
        //For first name
        ValidationUser firstName = () -> {
            System.out.print("Enter first name :");
            String fname = sc.nextLine();

            if (fname.matches("[A-Z][a-z]{3,}"))
                System.out.println(fname + " is valid");
            else
                System.out.println(fname + " is not valid");
        };
        firstName.validate();

        //For last name
        ValidationUser lastName = () -> {
            System.out.print("Enter last name :");
            String lname = sc.nextLine();
            if (lname.matches("[A-Z][a-z]{3,}"))
                System.out.println(lname + " is valid");
            else
                System.out.println(lname + " is not valid");
        };
        lastName.validate();

        //For mobile number
        ValidationUser m_number = () -> {
            System.out.print("Enter mobile number :");
            String mobile_number = sc.nextLine();
            if (mobile_number.matches("^(91\\s)[789][0-9]{9}$"))
                System.out.println(mobile_number + " is valid");
            else
                System.out.println(mobile_number + " is not valid");
        };
        m_number.validate();

        //For password
        ValidationUser password = () -> {
            System.out.print("Enter password :");
            String password_1 = sc.nextLine();
            if (password_1.matches("[a-zA-Z]{8,}$"))
                System.out.println(password_1 + " is valid");
            else
                System.out.println(password_1 + " is not valid");
        };
        password.validate();

        //For password at least one upper case
        ValidationUser pass_uppercase = () -> {
            System.out.print("Enter password which is at least one upper case :");
            String password_2 = sc.nextLine();
            if (password_2.matches("[A-Z]{1}[a-z]{8,}"))
                System.out.println(password_2 + " is valid");
            else
                System.out.println(password_2 + " is not valid");
        };
        pass_uppercase.validate();

        //For password at least one number
        ValidationUser pass_number = () -> {
            System.out.print("Enter password which is at least one number :");
            String password_3 = sc.nextLine();
            if (password_3.matches("[0-9A-Za-z]{8,}$"))
                System.out.println(password_3 + " is valid");
            else
                System.out.println(password_3 + " is not valid");
        };
        pass_number.validate();
    }
}
