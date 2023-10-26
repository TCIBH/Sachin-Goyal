package Regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class AadharValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number in format XXXX-XXXX-XXXX");
        String str = scan.nextLine();
        boolean  result= Pattern.matches("\\d{4}-\\d{4}-\\d{4}", str);
        if (result)
        {
            System.out.println("valid Aadhar number");
        }
        else
            System.out.println("invalid Aadhar number  \n please enter correct aaddhar number");
    }
}