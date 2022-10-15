import java.util.Scanner;

public class Password {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a password with the following requirements");
        System.out.println("1. 8-16 charcters long");
        System.out.println("2. at least one lower case letter");
        System.out.println("3. at least one upper case letter ");
        System.out.println("4. at least one number 0-9");
        System.out.println("5. at least one of these special symbols ~!@#$%^&*()-=+_ ");
        String password = scanner.nextLine();
        scanner.close();
        String specialCharacters = "~!@#$%^&*()-=+_";
        String numbers = "0123456789"; 

        char ch;
        ch = password.charAt(0);
        if (password.length() > 16 || password.length() < 8) {
            System.out.println("Password needs to be 8-16 charcters long " + password + " is invaild.");
        } else if (!(Character.isLowerCase(ch))) {
            for (int i = 1; i < password.length(); i++) {
                ch = password.charAt(i);

                if (!Character.isLowerCase(ch)) {
                    System.out.println(" Password needs a lowercase letter. " + password + " is invaild.");
                    password = "";
                }
            }
        } else if (!(Character.isUpperCase(ch))) {
            for (int i = 0; i < password.length(); i++) {
                ch = password.charAt(i);
                System.out.println("Password needs a uppercase letter. " + password + " is invaild.");
                password = "";
            }

        } else if (password.contains (numbers)) {
            System.out.println("Your password is " + password); 

        }
        else if (password.contains(specialCharacters)) {

            System.out.println("Your password is " + password);

        } else {
            System.out.println("Your password " + password + " is invaild.");
        }
    }

}
