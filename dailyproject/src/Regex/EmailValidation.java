package Regex;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your email id");
        String str=scan.nextLine();
        boolean result= Pattern.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z]+.com|org|net*$",str);
        System.out.println(result);
        if (result)
        {
            System.out.println("valid email syntax");
        }
        else
        {
            System.out.println("not valid syntax");
        }
    }
}
