package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number in format XXX-XXX-XXXX");
        String str=scan.nextLine();
        boolean result= Pattern.matches("\\d{3}-\\d{3}-\\d{4}",str);
        System.out.println(result);
      if(result){
           String first = str.replaceAll("\\d{3}-\\d{3}-\\d{4}", "($1) $2-$3");
         System.out.println(first);
        }

        else
           System.out.println("invalid format");
    }
}
