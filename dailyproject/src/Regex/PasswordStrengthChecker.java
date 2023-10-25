package Regex;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your password");
        String str = scan.nextLine();
        boolean result = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,16}$", str);
        if (str.length() >= 8 && str.length() <= 16) {
            if (result)
                System.out.println("strong password");
            else
                System.out.println("weak password");
        } else
            System.out.println("enter a password in range 8-16");
    }
}
