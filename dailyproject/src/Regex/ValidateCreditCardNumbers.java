package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateCreditCardNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number in format XXXX-XXXX-XXXX-XXXX");
        String str = scan.nextLine();
        if(Pattern.matches("^1234\\s\\d{4}\\s\\d{4}\\s\\d{4}", str))
        {
            System.out.println("you have enter RuPay credit card");}
        else if(Pattern.matches("^4561\\s\\d{4}\\s\\d{4}\\s\\d{4}", str))
        {
            System.out.println("you have enter mastercard details");}
         else if (Pattern.matches("\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}", str)) {
            System.out.println("you have entered a credit card \n"+str);
        }
        else
            System.out.println("enter a invalid card number ");
    }
    }
