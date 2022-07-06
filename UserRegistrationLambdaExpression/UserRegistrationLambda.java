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
}
