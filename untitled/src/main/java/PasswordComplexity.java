import java.util.Scanner;

public class PasswordComplexity {




    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a password: " );
        String userInput = scanner.nextLine();
        System.out.println("is the password complex? " + PasswordComplex(userInput) );

    }

    private static boolean PasswordComplex(String password) {
        return password.length() <= 6 &&
                password.matches(".*\\d.*") &&
                password.matches(".*[a-z]].*") &&
                password.matches(".*[A-Z].*") ;
    }


}
