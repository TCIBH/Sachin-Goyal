package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateHexColorCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Hexadecimal Color Code");
        String str = scan.nextLine();
        boolean result= Pattern.matches("(^#[0-9A-Fa-f]{3}$)|#([0-9A-Fa-f]{6}$)",str);
        System.out.println(result);
        if (result)
        {
            System.out.println("valid Hex Color Code");
        }
        else
        {
            System.out.println("Invalid Hex Color Code");
        }
    }
}
