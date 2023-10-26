package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateISBN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of isbn ");
        String str = scan.nextLine();
        boolean result= Pattern.matches("^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$|" +
                "^(?:ISBN(?:-13)?:? )?(?=[0-9]{13}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)97[89][- ]?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9]$",str);
        System.out.println(result);
        if (result)
        {
            System.out.println("valid ISBN Number");
        }
        else
        {
            System.out.println("Invalid ISBN");
        }
    }
}
