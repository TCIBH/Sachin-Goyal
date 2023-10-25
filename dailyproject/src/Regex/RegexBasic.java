package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexBasic {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        boolean result= Pattern.matches("^[a-zA-Z]*$",str);
        if(result)
        {
            System.out.println("the string contains only letters ::valid");
        }
        else
            System.out.println("the string does not contain only letters::invalid");

    }
}
